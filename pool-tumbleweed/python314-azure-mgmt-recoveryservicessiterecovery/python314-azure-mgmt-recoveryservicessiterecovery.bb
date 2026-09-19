SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-recoveryservicessiterecovery-2.0.0-1.1.noarch.rpm"
RPM_HASH = "87a00361a7a0e840ee25cb233af29aa2859955c6d20972d1ac28886f0a89ef7f5ec86f220077f718e8fa089228ef2161e75f9aa40358cfb05f2fe7c6197d4264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-recoveryservicessiterecovery \
python314-azure-mgmt-recoveryservicessiterecovery \
python3dist-azure-mgmt-recoveryservicessiterecovery"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
