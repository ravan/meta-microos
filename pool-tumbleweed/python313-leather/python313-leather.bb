SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python313-leather-0.3.4-3.5.noarch.rpm"
RPM_HASH = "969224fddf63ee6f5cfdd07a81d687e279d0e2ea59202aa98aa5234e9cbc021ba7b8fb8e40e62da739df5ef24dad63b2b76c96794fad9d8dab751cefec1114b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-leather \
python3.13dist-leather \
python313-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
