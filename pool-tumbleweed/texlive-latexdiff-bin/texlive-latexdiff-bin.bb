SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2026.20260301.svn16420-120.4.aarch64.rpm"
RPM_HASH = "db0dc9ba622f0e5bc7e199d71052391fb3f1672c26f8b7669b7cc4ce1e873cb36213123b7e82d7e0bc886c73c52b38da7f4299093d9ee8886100b5315514c614"

RPROVIDES:${PN} += "texlive-latexdiff-bin"

RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm
