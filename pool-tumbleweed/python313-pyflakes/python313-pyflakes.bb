SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-pyflakes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "1a9e14ba568d6244e4774039189dad4b4fa589e8b212eea4030b3c6fd84d349beff1254c952df753a8d8f29170fcd6b29e09bddda73bf1a5de9d93ffa8084594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyflakes \
python3.13dist-pyflakes \
python313-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
