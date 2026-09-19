SUMMARY = "Java Bindings for Google Protocol Buffers (bom)"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains the bill-of-materials pom of the Java bindings."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "protobuf-java-bom-36.1-1.1.noarch.rpm"
RPM_HASH = "1776932af830572456500861bf8cc3f5f245764f61cb3d80b6077bad8d17e863dfeb004cd61d53ee8b81f2e31112b7c4468bb686ed8ffa425bc2fbc057e6a15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-bom-pom- \
protobuf-java-bom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
