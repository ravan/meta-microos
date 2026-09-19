SUMMARY = "A poor man's debugger for Python"
DESCRIPTION = "A poor man's debugger for Python."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python313-PySnooper-1.2.3-1.4.noarch.rpm"
RPM_HASH = "25eff5c7323acf0d9dcb27564a4c57c7ea381e2e68e96f49599b35ab320f4dcfbe11bdb302974009d45487846585b69f2c255794f7edd5d8342f2eeb63683d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySnooper \
python3.13dist-pysnooper \
python313-PySnooper \
python3dist-pysnooper"

RDEPENDS:${PN} += "python-abi \
python313-base"

inherit rpm
