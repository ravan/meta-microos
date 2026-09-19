SUMMARY = "Java bindings for various native APIs"
DESCRIPTION = "A collection of cross-platform Java APIs \
for various native APIs. \
 \
These APIs support Java 5 and later. Some \
of these APIs overlap with APIs available \
in later Java versions."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-0.14-5.2.aarch64.rpm"
RPM_HASH = "aeef5a9cbe9677e157d5497e6780de75ce4485308816068ee98b98eaa2fcef8b0f2ca6bae4151453f2330945d1143863018751c4fc89f81c8104d3d2bc13988b"

RPROVIDES:${PN} += "libnative-platform-curses.so \
libnative-platform.so \
mvn-net.rubygrapefruit-native-platform \
native-platform"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
