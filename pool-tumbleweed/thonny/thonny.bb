SUMMARY = "Python IDE for beginners"
DESCRIPTION = "Thonny is a Python IDE meant for learning programming."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "thonny-5.0.0-1.2.noarch.rpm"
RPM_HASH = "1187cd6ffb1279a15838da8a3805034866c4bb85d08b326cc6bc8dc08d064ee0035ba1fcff138083a080e59e12c15e24d284a22132cd52876d47b86872c82614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-thonny \
python3dist-thonny \
thonny"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
desktop-file-utils \
mypy \
python-abi \
python3-Send2Trash \
python3-astroid \
python3-asttokens \
python3-docutils \
python3-jedi \
python3-pylint \
python3-pyserial \
python3-setuptools \
python3-tk \
python3-wheel"

inherit rpm
