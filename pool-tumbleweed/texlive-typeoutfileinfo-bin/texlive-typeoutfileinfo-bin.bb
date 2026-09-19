SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2026.20260301.svn25648-120.4.aarch64.rpm"
RPM_HASH = "9f38868d594cb6f72a2c03b69e9667c8292b201604d2520f30f512fc1623401ef59a2764efb5f44b3fece146a78261944693bbbc5d430e881f85ce3169300acb"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin"

RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
