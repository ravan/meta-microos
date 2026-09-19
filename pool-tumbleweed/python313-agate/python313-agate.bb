SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.14.2"

RPM_NAME = "python313-agate-1.14.2-1.3.noarch.rpm"
RPM_HASH = "ecbf585d48f1e794f33836177b30dbca88a1d4500454c961e2d5d37c16b4fd8d03d2417d36e8380b8cb647371b21902ffc8c2c9322be17e0ba9546efef227f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate \
python3.13dist-agate \
python313-agate \
python3dist-agate"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-isodate \
python313-leather \
python313-parsedatetime \
python313-python-slugify \
python313-pytimeparse"

inherit rpm
