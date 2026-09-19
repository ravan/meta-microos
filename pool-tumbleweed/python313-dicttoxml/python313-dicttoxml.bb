SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python313-dicttoxml-1.7.16-2.5.noarch.rpm"
RPM_HASH = "9440a264a1b32491d8205bcc794453cc241aadaefa166b8ac39bdd24b073b055760788e7c9aedf2b8dd286b7a27ff334f48fa59df14e35d1a25c73e2e285a07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dicttoxml \
python3.13dist-dicttoxml \
python313-dicttoxml \
python3dist-dicttoxml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
