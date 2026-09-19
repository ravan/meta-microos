SUMMARY = "Microsoft Azure Programenrollment Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Programenrollment Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-programenrollment-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "b62682794a2dbe9385f9314dfb2ab0df09968e0658719356abfe8039ceefd21f93c6f0d59dad4a3f21992b200866af4f6fc37de757ef74c46ff20ded0f79e9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-programenrollment \
python314-azure-mgmt-programenrollment \
python3dist-azure-mgmt-programenrollment"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
