SUMMARY = "Java Bindings for Google Protocol Buffers (parent pom)"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains the parent pom of the Java bindings."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "protobuf-java-parent-36.1-1.1.noarch.rpm"
RPM_HASH = "4d81b2edad3b52475790ba00d579aa7196205642138cae23491b790bba41597a613008e2f8066fad1fe0cf5dbe280a3dc1afaa876a365c456987abdcec21dfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-parent-pom- \
protobuf-java-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
