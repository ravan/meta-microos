SUMMARY = "Documentation for texlive-psgo"
DESCRIPTION = "This package includes the documentation for texlive-psgo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17svn78101"

RPM_NAME = "texlive-psgo-doc-2026.226.0.0.17svn78101-59.2.noarch.rpm"
RPM_HASH = "4b360887c8e00e06925a5a44ea30e1e8aa8a3469017719ed3c27474af2e81473f4dda11a79d74d92ce4481be38dab24993e4971d938d2f59ea46cf623d9b43af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psgo-doc"

RDEPENDS:${PN} += ""

inherit rpm
