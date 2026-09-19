SUMMARY = "Documentation for texlive-chemexec"
DESCRIPTION = "This package includes the documentation for texlive-chemexec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21632"

RPM_NAME = "texlive-chemexec-doc-2026.226.1.0svn21632-60.2.noarch.rpm"
RPM_HASH = "29a73a4981c5a0fe0b16302900b503e52a550afeb838acd7661353a50528819db4da94f1851b1ddd854b6e6a568c287d4a10b9873bb40aa0d9546acfb1c3eaa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemexec-doc-de;en \
texlive-chemexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
