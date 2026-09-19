SUMMARY = "Documentation for texlive-context-vim"
DESCRIPTION = "This package includes the documentation for texlive-context-vim"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn62071"

RPM_NAME = "texlive-context-vim-doc-2026.226.svn62071-61.2.noarch.rpm"
RPM_HASH = "b705d9ab474e1ea35d632091781bf8ec1248b4fa0fcd7565e0d4667dbe2d314aa6b2e551aa7f5b63e39740a8f9f028b3920940855c982718469d43158a848c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-vim-doc"

RDEPENDS:${PN} += ""

inherit rpm
