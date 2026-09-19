SUMMARY = "XML-RPC library for Qt"
DESCRIPTION = "libmaia is a XML-RPC library for Qt."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia1-0.9.0-1.37.aarch64.rpm"
RPM_HASH = "856b67fe1bb54e76524eaffcf2e67a56830221ee0a2b978ad0ffe1d9daeedff26e6255e1b438f28070270f81d09c4a9eb5703d07b9d77025a5795b3375279010"

RPROVIDES:${PN} += "libmaia.so.1 \
libmaia1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
