SUMMARY = "Documentation for texlive-qcircuit"
DESCRIPTION = "This package includes the documentation for texlive-qcircuit"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-doc-2026.226.2.6.0svn48400-60.4.noarch.rpm"
RPM_HASH = "2e4c2fb9aabc7ee19e2caed9906721eb0a8a08621c598607958d476f3a79896ad4801808110c49c6fbaa1ec42bb17fbe9042c4049b391608244bfd46d5a49df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcircuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
