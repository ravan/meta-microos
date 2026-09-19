SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python314-simplebayes-3.2.0-1.3.noarch.rpm"
RPM_HASH = "e7a46d792790c94dbda1bcfcf17eca1724ca448ae154756b74376e08bc634bb0b40f2908272642255130bc04e4c1aed495f98f63de899a9f881067f7a953fddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-simplebayes \
python314-simplebayes \
python3dist-simplebayes"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-fastapi \
python314-snowballstemmer \
python314-uvicorn"

inherit rpm
