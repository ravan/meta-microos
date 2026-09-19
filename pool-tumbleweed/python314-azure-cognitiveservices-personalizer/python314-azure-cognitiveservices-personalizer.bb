SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-azure-cognitiveservices-personalizer-0.1.1-1.2.noarch.rpm"
RPM_HASH = "86c6db00b81963cd1527c24ebfb637dee12ab92f53df21667fecd65369b078d248c83defa2cacda0e6393b496d8447074f0a8c6b32de859d96f0699ec187c86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-personalizer \
python314-azure-cognitiveservices-personalizer \
python3dist-azure-cognitiveservices-personalizer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
