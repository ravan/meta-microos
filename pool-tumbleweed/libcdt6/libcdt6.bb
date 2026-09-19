SUMMARY = "Container data types for Graphviz"
DESCRIPTION = "Library providing container data types for Graphviz."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libcdt6-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "5827c274f189aff07ba6993917ba904488434c6e10cac1c52166669a5979c72424f23a35379edd2a0ee5a1ca7c31500f24ba991d5e1e6a5106dc6f736904f2c8"

RPROVIDES:${PN} += "libcdt.so.6 \
libcdt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
