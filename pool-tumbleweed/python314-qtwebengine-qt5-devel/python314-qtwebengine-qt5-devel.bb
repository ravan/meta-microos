SUMMARY = "Development files for python314-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python314-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtwebengine-qt5-devel-5.15.6-6.7.aarch64.rpm"
RPM_HASH = "aa136127bf48cae796a5b5c79bd0cfc0ad44da6fccbfe61741fa7e91c05b37a1f42c6c7f41b4c7501092a2c860d7737da495fa404592bfe2f04e503480905604"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python314-qtwebengine-qt5-api \
python314-qtwebengine-qt5-devel \
python314-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python314-qt5-devel"

inherit rpm
