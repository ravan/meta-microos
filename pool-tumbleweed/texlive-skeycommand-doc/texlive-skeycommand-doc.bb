SUMMARY = "Documentation for texlive-skeycommand"
DESCRIPTION = "This package includes the documentation for texlive-skeycommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-doc-2026.226.0.0.4svn24652-64.2.noarch.rpm"
RPM_HASH = "bb664805efe59f2dafca07163830948cdc3278d0cc0d72a32392aa8f859cf36e1700d6fc510668a2e9ae7b701219d3c57db1887e23dfeec0856c825137349f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
