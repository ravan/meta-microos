SUMMARY = "Microsoft Azure Impactreporting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Impactreporting Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-impactreporting-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "144e78dad5270c546d238e2001a55aa2916f093bd1565a5bbc762b0675937b8c07ad4c86aac5516d97d1ae5310ac20d595073d3dc47b53fb680e175e200e2148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-impactreporting \
python314-azure-mgmt-impactreporting \
python3dist-azure-mgmt-impactreporting"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
