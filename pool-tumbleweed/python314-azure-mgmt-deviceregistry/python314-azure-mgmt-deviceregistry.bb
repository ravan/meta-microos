SUMMARY = "Microsoft Azure Deviceregistry Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceregistry Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-deviceregistry-1.1.0-1.4.noarch.rpm"
RPM_HASH = "1a819683572e81cfe01c85f0f4f7cd02b487747cb4fcbae0016a6e0f9d068e2777d57caff3b38903a479fa44f4c34912819f0f3e997aa2a27ef81871c85d5e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-deviceregistry \
python314-azure-mgmt-deviceregistry \
python3dist-azure-mgmt-deviceregistry"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
