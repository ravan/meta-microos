SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2026.20260301.svn24062-120.4.aarch64.rpm"
RPM_HASH = "651eeeed90aeb888dd885c6295bd7640db000fdf33323301f9f165823e94ed2650e60253be941da648a04e179608f4964f043259e09b75669a86128594ef54c1"

RPROVIDES:${PN} += "texlive-texliveonfly-bin"

RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm
