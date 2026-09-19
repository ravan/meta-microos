SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-simplebayes-3.2.0-1.3.noarch.rpm"
RPM_HASH = "ef0fe7f1eb91fc3d8ec9e7ac9f240922cf0e20fe6e36b96ab8e63099d8d634e0cecdca20e0693255ffcdcbfadcb34ce2056b8479e1bc93d578112f032244dcb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplebayes \
python3.13dist-simplebayes \
python313-simplebayes \
python3dist-simplebayes"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-fastapi \
python313-snowballstemmer \
python313-uvicorn"

inherit rpm
