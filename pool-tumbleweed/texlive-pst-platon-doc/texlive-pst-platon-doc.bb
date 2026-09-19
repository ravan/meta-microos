SUMMARY = "Documentation for texlive-pst-platon"
DESCRIPTION = "This package includes the documentation for texlive-pst-platon"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-doc-2026.226.0.0.01svn16538-60.4.noarch.rpm"
RPM_HASH = "9058446aae4beb4fca837bba2607db1a1d061e94e0e675b302db811fad0f9d23d6afe7fe92066c9d881fcbdc00bf8f6e6270f5e11493241247512113d359f893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-platon-doc"

RDEPENDS:${PN} += ""

inherit rpm
