SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "mozilla-nss-tools-3.127-1.1.aarch64.rpm"
RPM_HASH = "607f6a27e763c329b0bc4e710f9aa216738c5975a014be78dbb52baea8cd42ca489a5a4f371e34d9b2148c4ed9df2e0a14fa5c760040f1a03ea038904bf1f6ec"

RPROVIDES:${PN} += "mozilla-nss-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libz.so.1 \
mozilla-nss"

inherit rpm
