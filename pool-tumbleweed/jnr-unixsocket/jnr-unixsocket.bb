SUMMARY = "Unix sockets for Java"
DESCRIPTION = "Unix sockets for Java."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-0.38.19-2.10.noarch.rpm"
RPM_HASH = "2c967a08178f72c904b21749775a75cbf0e98c149115053f32a628d7e3f345725f35f924481df8d5797633ad4f626ab77647dcb61ec78beb1d7e331a52b10468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket \
mvn-com.github.jnr-jnr-unixsocket \
mvn-com.github.jnr-jnr-unixsocket-pom- \
osgi-com.github.jnr.unixsocket"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-ffi \
mvn-com.github.jnr-jnr-posix"

inherit rpm
