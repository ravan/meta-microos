SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team \
has established to create a unified SDK. The packages contained herein can \
be installed singly or as part of the azure namespace. Any other introductory \
text should go here. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-template-1.0.0-1.1.noarch.rpm"
RPM_HASH = "6889bc656c1677467f3771da1b768f6c6674185e75c88c6414a0543fd73a9e2711a409f13c8ab316ec001f14b0cd2a0ad4433c3635494638f9c6249936092468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-template \
python3.13dist-azure-template \
python313-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
python-abi"

inherit rpm
