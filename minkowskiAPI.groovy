//Your code here
CSG startCube = new Cube(100).toCSG()
CSG cubeToFit = new Cube(50).toCSG()
				.movez(startCube.getMaxZ())
				.setColor(javafx.scene.paint.Color.RED)
CSG clearenceFit = startCube
				.minkowskiDifference(
					cubeToFit,// the part we want to fit into a cutout
					5.0// the offset distance to fit
					)
CSG clearenceObject = cubeToFit.toolOffset(5.0)
					.movey(100)

return [clearenceFit,cubeToFit,clearenceObject]