SUMMARY = "Documentation for texlive-tikz-swigs"
DESCRIPTION = "This package includes the documentation for texlive-tikz-swigs"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59889"

RPM_NAME = "texlive-tikz-swigs-doc-2026.226.svn59889-59.2.noarch.rpm"
RPM_HASH = "3950e3c468a82e79769efc6bc36bee91eccedabbc6472333b067dd7dd285cd728faa95f4e029605b60fd602328e26dffce0d4e7ed313db453611cfafebdc0c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-swigs-doc"

RDEPENDS:${PN} += ""

inherit rpm
