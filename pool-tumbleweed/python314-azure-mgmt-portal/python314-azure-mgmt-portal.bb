SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-portal-1.0.1-1.2.noarch.rpm"
RPM_HASH = "337172767eadbbe1e57c4abc49592d9769d43dde679759a005f041668d4a8e92e0d2daf30e5b58db8984cb4bf18552713af56e46220e06f18056770df453832f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-portal \
python314-azure-mgmt-portal \
python3dist-azure-mgmt-portal"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
