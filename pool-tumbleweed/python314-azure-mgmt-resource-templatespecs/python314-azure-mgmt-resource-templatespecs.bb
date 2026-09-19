SUMMARY = "Microsoft Azure Resource Templatespecs Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Templatespecs Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-resource-templatespecs-1.0.0~b1-2.3.noarch.rpm"
RPM_HASH = "4f0fa00bc043cfdb486a7a10e5b97f4035eed3549061355693cae44ed83e2fb6c38598dbdbc8749fef56e5fa6a9ee737ecedb8bb3a0bb34154fe52534c867a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource-templatespecs \
python314-azure-mgmt-resource-templatespecs \
python3dist-azure-mgmt-resource-templatespecs"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-mgmt-resource \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
