SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-crashtest-0.4.1-2.14.noarch.rpm"
RPM_HASH = "627d3554166a9727ca93c63138a112773c364005f912766b75cb8c240afbe33906a977a5a15d63e6d4f44a3d456ef17092b134a1ecec699401951db9ee0f234e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crashtest \
python3.13dist-crashtest \
python313-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
