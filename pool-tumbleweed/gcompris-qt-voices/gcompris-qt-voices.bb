SUMMARY = "Voice files for gcompris-qt"
DESCRIPTION = "This is the voice data package for gcompris-qt-voices. This a full bundle for \
when you do not want to use the automatic online feature. \
 \
This allow you to play gcompris-qt-voices activities in different languages."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & CC-BY-SA-1.0+ & GFDL-1.1-or-later & SUSE-Public-Domain & SUSE-Free-Art-1.3"

PV = "26.1~20260512"

RPM_NAME = "gcompris-qt-voices-26.1~20260512-1.2.noarch.rpm"
RPM_HASH = "c41cacc5eb41db263d1e068f938aae839d832582b4f171bb35db79d787e698d547810c654a25edd7c7f8a74bedb319f77d5d7ed0d0c1313793a0865a4f785ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-voices \
gcompris-voices \
locale-gcompris-en"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
