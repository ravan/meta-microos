SUMMARY = "Tool and library for manipulating LilyPond files"
DESCRIPTION = "Tool and library for manipulating LilyPond files"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9"

RPM_NAME = "python313-ly-0.9.9-1.9.noarch.rpm"
RPM_HASH = "9babc8cd1a55bf3f3cd2a2cc5235c030b8e4bb4f23bc0a4e260071adcbfd876d7f5247843af3928f385588a539b2cf11ca09cccad7d3d2c11c337a445b5fa528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ly \
python3.13dist-python-ly \
python313-ly \
python3dist-python-ly"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
