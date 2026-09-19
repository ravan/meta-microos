SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python313-blockdiag-3.0.0-6.5.noarch.rpm"
RPM_HASH = "17ba575644b5a4ded87c994a713b838fa4447d70f7ab41a23c69b12fe6409c326475db4528f95798e98c08ea5e583802d08d01c9bfecdc88affb1856becfdec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blockdiag \
python3.13dist-blockdiag \
python313-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-funcparserlib \
python313-setuptools \
python313-webcolors"

inherit rpm
