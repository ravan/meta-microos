SUMMARY = "Binary files of context-legacy"
DESCRIPTION = "Binary files of context-legacy"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn75437"

RPM_NAME = "texlive-context-legacy-bin-2026.20260301.svn75437-120.4.aarch64.rpm"
RPM_HASH = "4db39526d8577ba4da238aaecf2412b5c94de6dd88ad9803a3b2ed7edfeb6dd0c83302b4c4c9b8308e46f440ab96868a66d2fe8b1fb0589c742dbdbb91266f3f"

RPROVIDES:${PN} += "texlive-context-legacy-bin"

RDEPENDS:${PN} += "texlive-context-legacy"

inherit rpm
