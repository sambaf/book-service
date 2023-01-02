# Build
custom_build(
#Name of the image
ref='book-service',
#build the image
command = 'mvnw  spring-boot:build-image',
deps = ['pom.xml', 'src']
)
#deploy
k8s_yaml(['k8s/deployment.yml','k8s/service.yml'])

k8s_resource('book-service' ,port_forwards=['9001'])