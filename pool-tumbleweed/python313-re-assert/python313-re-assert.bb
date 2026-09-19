SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-re-assert-1.1.0-3.5.noarch.rpm"
RPM_HASH = "6d44246165639b0d46b7cf531bec268cff90d96b14c1d2a901f62b6ea6ca73fc3fdf10e61fa1f1c57612f00f6f4b2a4e7e6a68ec617f6395478bdc7e056f5c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-re-assert \
python3.13dist-re-assert \
python313-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python313-regex"

inherit rpm
