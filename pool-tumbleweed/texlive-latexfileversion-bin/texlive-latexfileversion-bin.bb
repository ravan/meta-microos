SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2026.20260301.svn25012-120.4.aarch64.rpm"
RPM_HASH = "3433767541a411ceabd854f36de6f1232725b90cc804d101a5117f580cce446c9d95b9e0dea3c0d93815cdcb915346310ac1edc0e02a82e68da0611e09524372"

RPROVIDES:${PN} += "texlive-latexfileversion-bin"

RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm
