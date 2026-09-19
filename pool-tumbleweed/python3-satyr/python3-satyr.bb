SUMMARY = "Python 3 bindings for satyr"
DESCRIPTION = "Python 3 bindings for satyr."
LICENSE = "GPL-2.0-or-later"

PV = "0.43"

RPM_NAME = "python3-satyr-0.43-5.6.aarch64.rpm"
RPM_HASH = "e829ee17f334ed518280c3cfa8bdb7d8fe6771871b12ee8d077d2f717cd294ac8c25545be65a8777644de37304d1d5e516dd2340f8c89651aea647f5a7761da5"

RPROVIDES:${PN} += "python3-satyr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsatyr.so.4 \
libsatyr4 \
python-abi"

inherit rpm
