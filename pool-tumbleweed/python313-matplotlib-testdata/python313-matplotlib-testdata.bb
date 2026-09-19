SUMMARY = "Test data for python313-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-testdata-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "acd2295a8b5dce7b8fc6b5d7d404135dd3a31744bb1b729f1d905bb558bbd4a7a8516568c15764dd84b6d26c78ba4941b75757184df15565dbb857268eeb807a"

RPROVIDES:${PN} += "python3-matplotlib-testdata \
python313-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib"

inherit rpm
