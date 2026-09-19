SUMMARY = "ZSH completion for pdfgrep"
DESCRIPTION = "zsh shell completions for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pdfgrep-zsh-completion-2.2.0-1.7.noarch.rpm"
RPM_HASH = "210d3f20bc4805165b5338ed6b06e20be3a014fe59af42199f49fb2709002b0e83f1d6a782183b9bce0fec8ac2c0fcc8a2082c9fc0c65bb8261997da1d67761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
