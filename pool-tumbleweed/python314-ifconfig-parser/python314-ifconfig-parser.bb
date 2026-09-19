SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python314-ifconfig-parser-0.0.5-2.5.noarch.rpm"
RPM_HASH = "7b76d4d52835efde5ee4643d67f7ddad0883bf3de7c9d81e40a198b156030df40402d783ddbb2c49b09b818d76f7b904b2bfd0904084651fdc9fa95eaf080a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ifconfig-parser \
python314-ifconfig-parser \
python3dist-ifconfig-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
