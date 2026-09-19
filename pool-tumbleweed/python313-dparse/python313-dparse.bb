SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python313-dparse-0.6.4-1.10.noarch.rpm"
RPM_HASH = "7ba728ecb89e611ab5a31ebb109dffc5ab8fa244efc7beffeeeeb55df67d9ec5731c632daf3b97091b5a999e369441c845156f0078dee451cd0df2fbdaac1efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dparse \
python3.13dist-dparse \
python313-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-packaging"

inherit rpm
