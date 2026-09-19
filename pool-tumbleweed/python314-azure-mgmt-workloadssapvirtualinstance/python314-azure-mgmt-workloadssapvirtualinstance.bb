SUMMARY = "Microsoft Azure Workloadssapvirtualinstance Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadssapvirtualinstance Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-workloadssapvirtualinstance-1.0.0-1.3.noarch.rpm"
RPM_HASH = "bd841c315401317117bc7d8d07ca8800b9f8540dee8ea77940774b021ab50490e37d477ea007ee86289f0ae199e57d012645b615115896ed9df6820e0b767af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-workloadssapvirtualinstance \
python314-azure-mgmt-workloadssapvirtualinstance \
python3dist-azure-mgmt-workloadssapvirtualinstance"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
