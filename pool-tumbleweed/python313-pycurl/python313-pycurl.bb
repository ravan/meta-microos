SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.6"

RPM_NAME = "python313-pycurl-7.45.6-2.6.aarch64.rpm"
RPM_HASH = "d0dffd1b7d43601c4bbad708a69e51604dcba735091b58d5af268a3da0dc1b65f143e9d54bdd1ab62832c2056e90f322cfa0cea05332ddfb193b621dedd3f2bc"

RPROVIDES:${PN} += "python3-pycurl \
python3.13dist-pycurl \
python313-pycurl \
python3dist-pycurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
python-abi"

inherit rpm
