SUMMARY = "Documentation for texlive-jsclasses"
DESCRIPTION = "This package includes the documentation for texlive-jsclasses"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-jsclasses-doc-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "9a04dc1a27ff3078a5207d98170ec656b636497940ddd3959ba36ae1ce249261188cf12584e0d12641ab9c69c22e8db7a7a057dde85afa07caa57dafcadd97af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jsclasses-doc-ja \
texlive-jsclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
