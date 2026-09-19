SUMMARY = "Non-ABI stable experimental API for the Qt5 Multimedia library"
DESCRIPTION = "This package provides private headers of libqt5-qtmultimedia that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtmultimedia-private-headers-devel-5.15.19+kde2-1.2.noarch.rpm"
RPM_HASH = "6bdb569811b1f27bd67c117483d513e4b99dde4e6025742abedabc1fa634a2b01413922fb6f000b5d707a8c120558d9f8f7326a1bb6262658583fc407df02485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Multimedia-private-headers-devel \
libqt5-qtmultimedia-private-headers-devel"

RDEPENDS:${PN} += "libQt5Gui-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtmultimedia-devel"

inherit rpm
