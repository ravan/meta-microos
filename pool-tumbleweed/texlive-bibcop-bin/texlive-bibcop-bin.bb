SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn65257"

RPM_NAME = "texlive-bibcop-bin-2026.20260301.svn65257-120.4.aarch64.rpm"
RPM_HASH = "39a1212f953039895ef746cad65cf9f5c9ae192ac8bc757d7419d8c95511a0488fb07bf3a5a4646c6e3e48fcfa53450833cbbd019aeafe3a3c5c09e89209a2e5"

RPROVIDES:${PN} += "texlive-bibcop-bin"

RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm
