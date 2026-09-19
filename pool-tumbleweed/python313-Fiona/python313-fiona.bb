SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "python313-Fiona-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "3dbebdb5194bfd54c0a70411c76b373aad24cd7ffab4c46b12731d101dab8c186d906e71354f37b8449d9645d1f07ba05fe2538afb4a3038ae0ccf800952c4bc"

RPROVIDES:${PN} += "python3-Fiona \
python3.13dist-fiona \
python313-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libstdc++.so.6 \
python-abi \
python313-attrs \
python313-certifi \
python313-click \
python313-click-plugins \
python313-cligj"

inherit rpm
