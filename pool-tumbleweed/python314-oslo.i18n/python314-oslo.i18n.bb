SUMMARY = "OpenStack i18n library"
DESCRIPTION = "The oslo.i18n library contain utilities for working with internationalization \
(i18n) features, especially translation for text strings in an application \
or library."
LICENSE = "Apache-2.0"

PV = "6.9.0"

RPM_NAME = "python314-oslo.i18n-6.9.0-1.1.noarch.rpm"
RPM_HASH = "ec5c1702ee3a3d3db11fcb5a076a08c4b8a50e4a7b94943c959d8bad41db54b14c7d758f22bf829d035c782210390123c400b08203961cfe32577cc6a85b64ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.i18n \
python314-oslo.i18n \
python3dist-oslo.i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
