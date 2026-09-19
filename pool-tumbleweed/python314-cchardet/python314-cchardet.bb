SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.19"

RPM_NAME = "python314-cchardet-2.1.19-5.3.aarch64.rpm"
RPM_HASH = "5ec9778e0efac53bc94eb3effe2807f83bc153a7526cd964dac59eb0c69c495000bce9f9ece00ab9fc60cdd4c5a7392f014f0a03946b0b88721e71677a6dde1f"

RPROVIDES:${PN} += "python3.14dist-faust-cchardet \
python314-cchardet \
python314-faust-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
