SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn14758"

RPM_NAME = "texlive-findhyph-bin-2026.20260301.svn14758-120.4.aarch64.rpm"
RPM_HASH = "9efa55121a903dce8869aa6cef2cd2be078fc15f8f09310effd079d99337a9fb9f43c133588378f2c0490c026b3906ca90470f48d53d18e931e4eb7ee4219ba4"

RPROVIDES:${PN} += "texlive-findhyph-bin"

RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
