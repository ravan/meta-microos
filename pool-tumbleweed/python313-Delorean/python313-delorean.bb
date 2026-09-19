SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-Delorean-1.0.0-5.5.noarch.rpm"
RPM_HASH = "dbd32ac678220059247a0a25e3ad67922dca1fc15ac3bd59e92813087bc2a88ecd1755a1623f3efe5ed6d0711b199d9b486897eae0c3f120a236ecd84582870c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Delorean \
python3.13dist-delorean \
python313-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-humanize \
python313-python-dateutil \
python313-pytz \
python313-tzlocal"

inherit rpm
