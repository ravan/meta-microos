SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn32919"

RPM_NAME = "texlive-rubik-bin-2026.20260301.svn32919-120.4.aarch64.rpm"
RPM_HASH = "dd814755a265a68a2d66d7b84e4ef09e04e95e86af597672273edf1546ac9abd266a5a34ecdc82225ad664a85783b083cd50510e9bd4ac6265fced4235cc342a"

RPROVIDES:${PN} += "texlive-rubik-bin"

RDEPENDS:${PN} += "texlive-rubik"

inherit rpm
