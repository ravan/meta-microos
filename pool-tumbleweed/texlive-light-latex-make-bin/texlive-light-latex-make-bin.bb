SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2026.20260301.svn56352-120.4.aarch64.rpm"
RPM_HASH = "2368ced0ab9669ab7167724fcf56413b5793cf16cf078c8d29e585c9f835e857041c1305bcff315f4115c8fdb4b3c703c24d7e5c9993315e017c74225979d4f2"

RPROVIDES:${PN} += "texlive-light-latex-make-bin"

RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm
