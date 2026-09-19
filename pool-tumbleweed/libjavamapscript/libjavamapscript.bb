SUMMARY = "Java/Mapscript map making extensions to Java"
DESCRIPTION = "The Java/Mapscript extension provides full map customization capabilities \
within the Java programming language."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "libjavamapscript-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "c818787845869ee1ff770f7e610f1b425be6681a10486efce971064c59ce056743a5fc1fb0d12ab7c5faff0fb60aecc7ca5a1c72b312154a6d89a85ccb0ca960"

RPROVIDES:${PN} += "java-mapscript \
libjavamapscript \
libjavamapscript.so \
mapserver-java"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
swig"

inherit rpm
