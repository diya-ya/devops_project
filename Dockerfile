# Use a lightweight Java image
FROM anapsix/alpine-java

# Maintainer info (you can update the email)
LABEL maintainer="diyasreelal@gmail.com"

# Copy the built JAR from your host into the image
COPY emiProject-1.0-jar-with-dependencies.jar /home/emiProject.jar

# Run the JAR with arguments 2, 3, 1
CMD ["java", "-jar", "/home/emiProject.jar", "10000", "10", "2"]
