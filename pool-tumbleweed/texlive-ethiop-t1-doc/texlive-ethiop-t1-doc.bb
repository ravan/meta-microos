SUMMARY = "Documentation for texlive-ethiop-t1"
DESCRIPTION = "This package includes the documentation for texlive-ethiop-t1"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ethiop-t1-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7a29209752ac707695ab7483edcbd59a76331c81d1bf052671684fe92dda136f215932b822d63dfe6bd1e55a35b0fd29819a66c79a2aa631c6e2ac2ff61c75ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
