SUMMARY = "Microsoft Azure Playwright Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Playwright Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-healthbot-1.0.0-1.2.noarch.rpm"
RPM_HASH = "da207b25d4bf895e2d6c5c1a177372d27b427c0726fe4bb41b5cc07a1b4130f2bb18d286acf2b5bc40e6c8bd61d4cd10993cf22716908c70046c0bed6638df60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-healthbot \
python3.13dist-azure-mgmt-healthbot \
python313-azure-mgmt-healthbot \
python3dist-azure-mgmt-healthbot"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
