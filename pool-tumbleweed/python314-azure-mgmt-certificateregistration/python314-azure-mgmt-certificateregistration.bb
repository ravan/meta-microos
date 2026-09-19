SUMMARY = "Microsoft Azure Certificateregistration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Certificateregistration Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-certificateregistration-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "82c310b21fa28cc3ac065b0d91bd99eadd9f2c9e97eb4f5a6c77ab9d49b146dcb44ad296965a6d0d325325d5f4d1232c304185dc6324f1c057ecb837b4aa6253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-certificateregistration \
python314-azure-mgmt-certificateregistration \
python3dist-azure-mgmt-certificateregistration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
