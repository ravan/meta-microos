SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-loadtesting-1.0.0-2.9.noarch.rpm"
RPM_HASH = "1ac180b67a7133e043897ce6f10d366d595cd9963d494cadce07c0e3ee72fddd855b5490f5b8575677c30d98bbcc3beda507dc509dfd257524b251ffb5ccf382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtesting \
python3.13dist-azure-mgmt-loadtesting \
python313-azure-mgmt-loadtesting \
python3dist-azure-mgmt-loadtesting"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
