SUMMARY = "Python bindings for genders"
DESCRIPTION = "Necessary files for using genders with Python."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "python3-genders-1.32-1.10.aarch64.rpm"
RPM_HASH = "6d7c386fe6518060b7e819c12fc5ba76c2a309e9051a3a30fbf508d4dcbc45dd5be3868d77c03ba2d127c466e7fedb532919ea06ed1a8a1566024ea48f572134"

RPROVIDES:${PN} += "libgenders.cpython-313-aarch64-linux-gnu.so \
python3-genders \
python3.13dist-libgenders \
python3dist-libgenders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
python-abi"

inherit rpm
