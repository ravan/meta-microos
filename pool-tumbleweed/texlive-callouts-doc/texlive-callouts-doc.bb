SUMMARY = "Documentation for texlive-callouts"
DESCRIPTION = "This package includes the documentation for texlive-callouts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44899"

RPM_NAME = "texlive-callouts-doc-2026.226.svn44899-59.2.noarch.rpm"
RPM_HASH = "33ca64d5977505604d605d3e3855c6187adfa3cce2a7cf8fadb43dc89745bea5cb93da3f4cc23aa5ceed7e41dc2ce56f1ea4f2213f5b8bd9c34d8599f17ddd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-callouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
