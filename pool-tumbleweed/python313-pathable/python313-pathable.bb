SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python313-pathable-0.6.0-1.2.noarch.rpm"
RPM_HASH = "cbe21c8b16072a06ff62fd0f454ca0c7aa59b1359590130d1dd6354040bcdcb1e63ee88ac98273cfe4c66571d10d00a704b88066ccbc11cb8417c7df1a9d7863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictpath \
python3-pathable \
python3.13dist-pathable \
python313-dictpath \
python313-pathable \
python3dist-pathable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
