SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn15543"

RPM_NAME = "texlive-cachepic-bin-2026.20260301.svn15543-120.4.aarch64.rpm"
RPM_HASH = "154a3fc4e3cfa3d0b063aefe57d1f3e5b1896cb26fe3f82f101b2ceb72417ad27418551ba4697dd1deeda2fae69ae488f54caa8b8793638003b61e71f7804a6c"

RPROVIDES:${PN} += "texlive-cachepic-bin"

RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
