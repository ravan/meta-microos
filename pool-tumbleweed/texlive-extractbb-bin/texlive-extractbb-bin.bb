SUMMARY = "Binary files of extractbb"
DESCRIPTION = "Binary files of extractbb"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn72890"

RPM_NAME = "texlive-extractbb-bin-2026.20260301.svn72890-120.4.aarch64.rpm"
RPM_HASH = "2e97916653533746d27bbf852f4a63237a1855b53e00e64bd5192924a2f18799f27428b90c156f725330fb58b980cd09fa21e3a09e3a068d0846ae8428652cf5"

RPROVIDES:${PN} += "texlive-extractbb-bin"

RDEPENDS:${PN} += "texlive-extractbb"

inherit rpm
