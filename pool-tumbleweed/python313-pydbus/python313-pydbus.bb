SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python313-pydbus-0.6.0-2.5.noarch.rpm"
RPM_HASH = "b7cbfa4ec5a44c54922bd0ba642f65434b836e510afa5e9d4dd8973b9de0ed9a7cb1981b141083af5aaaaf4039c488edfc023219c2119e79245d6ba7440a93e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydbus \
python3.13dist-pydbus \
python313-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python313-gobject"

inherit rpm
