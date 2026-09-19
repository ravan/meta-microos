SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-azure-cognitiveservices-personalizer-0.1.1-1.2.noarch.rpm"
RPM_HASH = "f44484c5ae4ea593e298c8fad17e0a3d527a85e26d24809749cd364da25f3953796e153b4474f8693f9e4ee0d0c700c0386a438f10ad3c0f2d5ecd46fb60dd24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-personalizer \
python3.13dist-azure-cognitiveservices-personalizer \
python313-azure-cognitiveservices-personalizer \
python3dist-azure-cognitiveservices-personalizer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
