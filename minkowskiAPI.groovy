
CSG startCube = new Cube(100).toCSG()
CSG cubeToFit = new Cube(50).toCSG()
				.movez(startCube.getMaxZ())
				.setColor(javafx.scene.paint.Color.RED)
// This performs an intersection of the 2 parts, then minkowski the intersection,then cut the reslult from the base shape
// Use this function to make cut outs that will be 3d printed
CSG clearenceFit = startCube
				.minkowskiDifference(
					cubeToFit,// the part we want to fit into a cutout
					5.0// the offset distance to fit
					)
// To simply make a normal offset version of a given object us this funtion
// positive values makes a normal outset, and negative values makes a normal inset. 			
CSG clearenceObject = cubeToFit.toolOffset(5.0)
					.movey(100)

return [clearenceFit,cubeToFit,clearenceObject]