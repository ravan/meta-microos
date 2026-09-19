SUMMARY = "Non-ABI stable experimental API for the Qt5 WebChannel library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebchannel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qtwebchannel-private-headers-devel-5.15.19+kde3-1.2.noarch.rpm"
RPM_HASH = "22401e534806b1a0d651b735d5231ccaba227ecd18928cd7ae6dfd847ead7ac4120144de75e60edcaeb121310191bc26f2e446f4d4550728dcf183b5dde1793f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebchannel-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebchannel-devel"

inherit rpm
