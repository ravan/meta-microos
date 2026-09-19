SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python314-dicttoxml-1.7.16-2.5.noarch.rpm"
RPM_HASH = "4c904708dd7ac9d16ae7b16a144d91dc281eb287a5218b660b402cb1029e6af2ab27478deb71620bef1f395d0d6dbe986a6398be6fdb5cc63a366fe74466caac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dicttoxml \
python314-dicttoxml \
python3dist-dicttoxml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
