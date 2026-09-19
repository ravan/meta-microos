SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn10937"

RPM_NAME = "texlive-latexmk-bin-2026.20260301.svn10937-120.4.aarch64.rpm"
RPM_HASH = "48c5b7d246b1c83cbd217873d28ccc8670819a2cf0fed161254ab1e456000eee9ef28c908ebb9b575024aa032caf01e519ff570e58e12bf17349fd1f7f57f082"

RPROVIDES:${PN} += "texlive-latexmk-bin"

RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm
