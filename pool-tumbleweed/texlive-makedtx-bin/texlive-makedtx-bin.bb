SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn38769"

RPM_NAME = "texlive-makedtx-bin-2026.20260301.svn38769-120.4.aarch64.rpm"
RPM_HASH = "4f152a20d20ff3f465b8b4189d221a4a63aae257d5a1518e06768ba2a36b53af43aad6adf68b2fe0a0ff0630b57ad61a9025392b008e4fc25fbd78a2fa55e0bf"

RPROVIDES:${PN} += "texlive-makedtx-bin"

RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm
