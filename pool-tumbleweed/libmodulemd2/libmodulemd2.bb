SUMMARY = "Main library for libmodulemd"
DESCRIPTION = "This package provides the main library for applications \
that use libmodulemd."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "libmodulemd2-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "5c183962de1f3c5b502b74733efa288751e81ec5c59571141f10e732c5ac64dc2585bf3d42e6858e11b1955d472f4b9dcd36ea0100f5c75c4bbceb81ba045385"

RPROVIDES:${PN} += "libmodulemd.so.2 \
libmodulemd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librpmio.so.10 \
libyaml-0.so.2"

inherit rpm
