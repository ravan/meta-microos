SUMMARY = "Documentation for texlive-ecgdraw"
DESCRIPTION = "This package includes the documentation for texlive-ecgdraw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76130"

RPM_NAME = "texlive-ecgdraw-doc-2026.226.0.0.1svn76130-61.4.noarch.rpm"
RPM_HASH = "897e5cf5172feb281b50d24d2c0298e64e9e26b8c933ca1ff0b4978af91b432bd5c22fae8883c7a63d0b27c1bbb805baffcb2eeb998738da7329414e38f1b7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecgdraw-doc-it \
texlive-ecgdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
