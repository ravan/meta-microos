SUMMARY = "Python3 bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Python3 bindings to access the OpenWSMAN client \
API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "python3-openwsman-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "5b148487bd4abba1231fe83e016c80d4988e8a681b6e68c65da9d8fe6abb5f4c09cd634fb7f3b2a0f2cc02f8b87380057722a5d9fc900aca5e4f3579552de9d0"

RPROVIDES:${PN} += "openwsman-python \
python3-openwsman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
python-abi \
python3"

inherit rpm
