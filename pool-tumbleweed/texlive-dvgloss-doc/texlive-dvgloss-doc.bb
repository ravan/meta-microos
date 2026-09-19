SUMMARY = "Documentation for texlive-dvgloss"
DESCRIPTION = "This package includes the documentation for texlive-dvgloss"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-doc-2026.226.0.0.1svn29103-61.4.noarch.rpm"
RPM_HASH = "48892d6d660f622ccbb025436ffc844d326f778623574d1069e8e2a0b5418c2aeb1927215a665268eeea5f91f1b1eb87c0593a196013507a094353f74d8b0734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvgloss-doc"

RDEPENDS:${PN} += ""

inherit rpm
