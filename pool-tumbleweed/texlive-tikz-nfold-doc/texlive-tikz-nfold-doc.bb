SUMMARY = "Documentation for texlive-tikz-nfold"
DESCRIPTION = "This package includes the documentation for texlive-tikz-nfold"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn67718"

RPM_NAME = "texlive-tikz-nfold-doc-2026.226.1.0.0svn67718-59.2.noarch.rpm"
RPM_HASH = "af41be42b60966ca72e0fd342d248cac081ea478fabab91792699d58069e353c7bf9bd0db04eaa237a789927203220b0548c6bf66bb11ba8f2d77fc37a72ea68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-nfold-doc"

RDEPENDS:${PN} += ""

inherit rpm
