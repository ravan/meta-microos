SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn24061"

RPM_NAME = "texlive-ctanify-bin-2026.20260301.svn24061-120.4.aarch64.rpm"
RPM_HASH = "8fec51162764e73242c2983b50f82dc6ba7829b89b33bc8baee3c8cc06e1b6f1bac982a2a321230f917538ecb500330f1a1e26a7b95bbf5ee8ea457cfed9419d"

RPROVIDES:${PN} += "texlive-ctanify-bin"

RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm
