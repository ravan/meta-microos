SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dolphin-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f99e16cbe6dc28448c392f30dece17095b1d9b5aaa90a27c525dc079037313251305c03e4ccb792870b299a38333aea2a462eec3959a8dbc3e89d57b4ea0a6bd"

RPROVIDES:${PN} += "cmake-DolphinVcs \
dolphin-devel \
dolphin5-devel"

RDEPENDS:${PN} += "libdolphinvcs6"

inherit rpm
