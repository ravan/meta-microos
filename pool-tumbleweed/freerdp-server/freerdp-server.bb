SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-server-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "9e43e212820d0fb3e51786472cffea6c1b061da3354b2469bc3c95bd61f01c122ebc9f3b313ce7273d508f62d8990e7b0c48c440b739b93922c75dbb81105d98"

RPROVIDES:${PN} += "freerdp-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-shadow-subsystem3.so.3 \
libfreerdp-shadow3.so.3 \
libfreerdp3.so.3 \
libwinpr-tools3.so.3 \
libwinpr3.so.3"

inherit rpm
