SUMMARY = "Microsoft Azure Playwright Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Playwright Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-healthbot-1.0.0-1.2.noarch.rpm"
RPM_HASH = "d79901837d5796ba2fb92dd4a0bc6a662058a1c347a04a6d239b1bba1d075bc39678d8238b817a2dcd1f010af2e1f78123fbd8d7289bd2278748e15233b88f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-healthbot \
python314-azure-mgmt-healthbot \
python3dist-azure-mgmt-healthbot"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
