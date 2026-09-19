SUMMARY = "Documentation for texlive-verifycommand"
DESCRIPTION = "This package includes the documentation for texlive-verifycommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn74512"

RPM_NAME = "texlive-verifycommand-doc-2026.226.1.11svn74512-60.2.noarch.rpm"
RPM_HASH = "d267ba60f4174ea384f0626eda896635a33b3a2e7c6de0f725344027f854eb7432444c48488d4145b5cb019b786c70b0887b333251af951ef377e3c5d1117a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verifycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
