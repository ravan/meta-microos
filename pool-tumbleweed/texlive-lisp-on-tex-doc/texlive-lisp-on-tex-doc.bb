SUMMARY = "Documentation for texlive-lisp-on-tex"
DESCRIPTION = "This package includes the documentation for texlive-lisp-on-tex"
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.1svn73165"

RPM_NAME = "texlive-lisp-on-tex-doc-2026.226.2.1svn73165-61.2.noarch.rpm"
RPM_HASH = "53df10178e85faf80504bf627e7dff06796350be3ff7111c360e11530ebe26f12f34306b2287a62de250a787e7d352a3ad48f6b16c4056956ee4ade6a84f3dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lisp-on-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
