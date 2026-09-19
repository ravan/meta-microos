SUMMARY = "Documentation for texlive-fragments"
DESCRIPTION = "This package includes the documentation for texlive-fragments"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fragments-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "692b9d2ed74b332bed1fb1f9186d44485e5f729b6ab5ed9a0264a9c8634355db8df7eced6897a64480d83ab9fa1b96439a7738e24308910974fd5afc6972af29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragments-doc"

RDEPENDS:${PN} += ""

inherit rpm
