SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-pydicom-data-1.0.0-3.8.noarch.rpm"
RPM_HASH = "d7f3fbbd0bb7bff98bf0dece027ee193303de382a226e5b02a0f0883563216ae75b411635210a2200bb8a1e69793217a08ae2809ad002ff3dcada9029aa72964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom-data \
python3.13dist-pydicom-data \
python313-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
