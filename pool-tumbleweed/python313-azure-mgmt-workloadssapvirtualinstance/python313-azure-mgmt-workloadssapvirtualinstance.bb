SUMMARY = "Microsoft Azure Workloadssapvirtualinstance Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadssapvirtualinstance Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-workloadssapvirtualinstance-1.0.0-1.3.noarch.rpm"
RPM_HASH = "66376ee9d044bdb1b6a997925ef8c5a4a3f383d389acad63e11db603b97cc5d8c3d508e85e4ae03720e7c9142c4bafce1875dbf4c765ce4277cad5325e6f2a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloadssapvirtualinstance \
python3.13dist-azure-mgmt-workloadssapvirtualinstance \
python313-azure-mgmt-workloadssapvirtualinstance \
python3dist-azure-mgmt-workloadssapvirtualinstance"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
