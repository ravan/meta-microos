SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2026.20260301.svn65625-120.4.aarch64.rpm"
RPM_HASH = "fcb08fd60f8319c72066c48e8a6e002996f473033a97c4494636d6c7a9662172b688da924045abb8d44242b773ce43d9cd5164c65e4eebd16848d94bcb667cfd"

RPROVIDES:${PN} += "texlive-pagelayout-bin"

RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm
