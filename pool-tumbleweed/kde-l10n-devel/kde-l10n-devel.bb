SUMMARY = "Tools for translating DocBook XML files with Gettext"
DESCRIPTION = "This is a collection of tools that facilitate translating DocBook XML \
files using Gettext message files (PO files)."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kde-l10n-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e3b309b847858c79154c2fed04163d1a3e9d15d47cd814421cd0ca40ef77731c2a33e8e59fcb367777ebdf612f428b04dfd191d41889e3b6e0f0e44745a9df25"

RPROVIDES:${PN} += "kde-l10n-devel \
kde4-l10n-devel \
poxml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgettextpo.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
