SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains the Java bindings."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "protobuf-java-36.1-1.1.noarch.rpm"
RPM_HASH = "dde894bb8ccb7be5e4014d83d173335a420864a220449cc0b3fb0c84741e3152f60d748267fe684ec767aaf56b6254c64e67adb30b90006bb23b99cc0384cf7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-java \
mvn-com.google.protobuf-protobuf-java-pom- \
mvn-com.google.protobuf-protobuf-java-util \
mvn-com.google.protobuf-protobuf-java-util-pom- \
mvn-com.google.protobuf-protobuf-javalite \
mvn-com.google.protobuf-protobuf-javalite-pom- \
protobuf-java"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.code.gson-gson \
mvn-com.google.errorprone-error-prone-annotations"

inherit rpm
