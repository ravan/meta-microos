SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-azure-mgmt-databox-3.1.0-1.5.noarch.rpm"
RPM_HASH = "ef944ab8d3262110bb91d0e1e527a01a236614b2e8b3c855e5d47b515800b13fe60ec87b82ab84b86fdd804ba12b36e3646acc806df6e47c8239ce03b39e77d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-databox \
python314-azure-mgmt-databox \
python3dist-azure-mgmt-databox"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.6.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
