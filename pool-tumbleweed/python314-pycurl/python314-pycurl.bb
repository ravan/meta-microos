SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.6"

RPM_NAME = "python314-pycurl-7.45.6-2.6.aarch64.rpm"
RPM_HASH = "6a0c06123588172ca34f42125c0917a5f735b58d452de1478669009a03c9f3b4e340d64318839a7c3e79b8220bc24494cd95e678a1a83fa9f64f726bbb7532b1"

RPROVIDES:${PN} += "python3.14dist-pycurl \
python314-pycurl \
python3dist-pycurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
python-abi"

inherit rpm
