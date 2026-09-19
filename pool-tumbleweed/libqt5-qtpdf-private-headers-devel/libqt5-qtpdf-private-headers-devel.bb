SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.19-3.3.noarch.rpm"
RPM_HASH = "92bde46dc37394dfb72313b2f56b661b60b0d7f3e9447f629d8b18dc0133d3284d4dfb494e1d6e1040100cb6a4e6e4ac5c8d4468a72e0323acc687cc4f44b51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtpdf-devel"

inherit rpm
