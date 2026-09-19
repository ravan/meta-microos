SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.19"

RPM_NAME = "python313-cchardet-2.1.19-5.3.aarch64.rpm"
RPM_HASH = "3bc4eee1dc63c5d5c0dc448c12e32cdccc4bcb1f2c7da3e5b0212a8bedfa4e3e3a75c5463907c67efa0515dd071a27a7ff74ff1d44aa0c0da104e6aad3a22cf6"

RPROVIDES:${PN} += "python3-cchardet \
python3-faust-cchardet \
python3.13dist-faust-cchardet \
python313-cchardet \
python313-faust-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
