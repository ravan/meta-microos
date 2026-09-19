SUMMARY = "Documentation for texlive-lua-tinyyaml"
DESCRIPTION = "This package includes the documentation for texlive-lua-tinyyaml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.4svn73671"

RPM_NAME = "texlive-lua-tinyyaml-doc-2026.226.0.0.4.4svn73671-59.2.noarch.rpm"
RPM_HASH = "90e422134fa6e23bbbc31431295e4f7eade0e3fe8387f870bab9433fe18a433f46c71521aa572c7f9451c94201775f237871233e3e7eb94400b171f7a2f76558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-tinyyaml-doc"

RDEPENDS:${PN} += ""

inherit rpm
