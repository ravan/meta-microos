SUMMARY = "Microsoft Azure Container Registry Tasks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Tasks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-containerregistrytasks-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "cffc02b6cde028459507604b5a11e661d5db96784174b55b949d9b089dfb9c4a888f251734d86616d21645b177308dd3df161504f8b4a1573ba1ba1551779ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerregistrytasks \
python314-azure-mgmt-containerregistrytasks \
python3dist-azure-mgmt-containerregistrytasks"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
