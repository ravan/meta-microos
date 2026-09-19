SUMMARY = "Documentation for texlive-enctex"
DESCRIPTION = "This package includes the documentation for texlive-enctex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn34957"

RPM_NAME = "texlive-enctex-doc-2026.226.svn34957-61.4.noarch.rpm"
RPM_HASH = "52fda6265f4cfd4e7091aaa0189d0e7c9d2445f0aeb445575bce673be4873e36c98ea2bc5dd2bb8399af254ec6eec4895369c799069fd1f6da027ae55806f620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-enctex-doc-en;cs \
texlive-enctex-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
