SUMMARY = "Information about breeze setup"
DESCRIPTION = "This package ships a CMake config file used to get information about Breeze."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9aa29b59ce262c915414c4abb122143fd4022512b63c92e53dcc0914c79fdbfe9e62a338c77f31fbbaea2cf175e96628babbcd50ece443c2782807de312df65d"

RPROVIDES:${PN} += "breeze6-devel \
cmake-Breeze"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
