SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2026.20260301.svn44515-120.4.aarch64.rpm"
RPM_HASH = "4e5f9d55f169f1320d8d42f6e4ec3a80292c774549dad3a76f0b1aaa59dc8b613a5393f0c3c22436ec9604758c07638a958f00aabc3d5a0bff3c52e933077a0a"

RPROVIDES:${PN} += "texlive-dviinfox-bin"

RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
