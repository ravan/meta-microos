SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29036"

RPM_NAME = "texlive-arara-bin-2026.20260301.svn29036-120.4.aarch64.rpm"
RPM_HASH = "9049bc1da3a66676873ff6cdd2ba679efbe4bc5d53ed96ad72e9f0ba6fc1eb707356a201e466d4db2ef05fbb3cb91e0a50a59a7171b790ac1a060099fdb165bd"

RPROVIDES:${PN} += "texlive-arara-bin"

RDEPENDS:${PN} += "texlive-arara"

inherit rpm
