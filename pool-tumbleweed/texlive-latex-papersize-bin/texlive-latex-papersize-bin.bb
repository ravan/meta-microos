SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2026.20260301.svn42296-120.4.aarch64.rpm"
RPM_HASH = "8d1b5329f261adb7bff1526e68033e6efd3b87c0ca17aa148c6b5d57b64a5c5ab6c94b92d1980e113ba6feb51509ca77bfc04eb381852980b2ffd94774d39ec1"

RPROVIDES:${PN} += "texlive-latex-papersize-bin"

RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
