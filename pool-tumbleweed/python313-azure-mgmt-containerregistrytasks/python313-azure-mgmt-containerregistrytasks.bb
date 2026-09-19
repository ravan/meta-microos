SUMMARY = "Microsoft Azure Container Registry Tasks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Tasks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-containerregistrytasks-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "c36c7b4b284a76cfa046939d7bd3d18913b9727617a2646c9777fec4ada1bd55947368598d07f372a186fe674782b2562f9f75de892bc5285af83f6c8f13a466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerregistrytasks \
python3.13dist-azure-mgmt-containerregistrytasks \
python313-azure-mgmt-containerregistrytasks \
python3dist-azure-mgmt-containerregistrytasks"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
