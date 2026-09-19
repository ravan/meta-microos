SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-hanzidentifier-1.3.0-1.8.noarch.rpm"
RPM_HASH = "21da9b18589dd04b8334cc0ca290c7454e38573474cbaa75ce47bd3fa0774dd3cbf9de14d638ea5f1ff278cd1d7d4acdfad5bbd29defce2dc15a321ce5c98273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hanzidentifier \
python3.13dist-hanzidentifier \
python313-hanzidentifier \
python3dist-hanzidentifier"

RDEPENDS:${PN} += "python-abi \
python313-zhon"

inherit rpm
