SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn41465"

RPM_NAME = "texlive-lollipop-bin-2026.20260301.svn41465-120.4.aarch64.rpm"
RPM_HASH = "ce9d829f0d75b2bfbcbfcec959fa5bdb553a077014b16a9ca313c8021cfea5c09695066ece8cb245ad658015bc884ba38090b35c4d4f197e7e345326e86bc761"

RPROVIDES:${PN} += "texlive-lollipop-bin"

RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm
