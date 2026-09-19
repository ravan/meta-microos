SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python314-linstor-1.12.0-2.4.noarch.rpm"
RPM_HASH = "0a27cd6e2a7f19265a6942f55680ec32df512de8272be4760b9b816cf86cbfe06f797fe6c21933e32e1b30d0c3c6cb878d9998d4586cbeb37a7fe8082652f5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-linstor \
python314-linstor \
python3dist-python-linstor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
