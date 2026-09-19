SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2026.20260301.svn45927-120.4.aarch64.rpm"
RPM_HASH = "c983421cbdb2fbd9274051bde9da8199d4699ebc967c1981359e48395cff2981affa266463506876b58a5328e3c6954afc037f8524f0319d03e76cd8d7ba5fdb"

RPROVIDES:${PN} += "texlive-crossrefware-bin"

RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm
