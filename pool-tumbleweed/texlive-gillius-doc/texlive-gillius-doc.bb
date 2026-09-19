SUMMARY = "Documentation for texlive-gillius"
DESCRIPTION = "This package includes the documentation for texlive-gillius"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gillius-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "9c47017e0f7cba53ac77011856cb57e0fffa8e52751039eea1755ee02073b7bc7e721fa78353c002009284c46f035d8c9ab884785a33178312e1143e27def217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillius-doc"

RDEPENDS:${PN} += ""

inherit rpm
