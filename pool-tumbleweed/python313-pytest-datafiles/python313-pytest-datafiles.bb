SUMMARY = "Plugin for pytest to create data files"
DESCRIPTION = "pytest plugin to create a 'tmp_path' containing predefined files/directories."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-pytest-datafiles-3.0.1-1.3.noarch.rpm"
RPM_HASH = "800bb8010d97bd44987b13fa08567f75c2816f135d6d408a5a929f4ec3d0c0fc67ce2f69f72c59bc9bc2bc20443799b11d0e76b5c970940487e410ac2c398af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-datafiles \
python3.13dist-pytest-datafiles \
python313-pytest-datafiles \
python3dist-pytest-datafiles"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
