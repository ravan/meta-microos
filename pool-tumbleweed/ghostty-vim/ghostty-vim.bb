SUMMARY = "Vim syntax highlighting for ghostty data files"
DESCRIPTION = "Optional files for syntax highlighting for ghostty data files in vim."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-vim-1.3.1-1.6.noarch.rpm"
RPM_HASH = "350df84f79c5e3e58c887d951623d4a454873665ee83ab5824d85562f8bf4a776f60b1ab47a8081e3699844bea006b629ff0aeb2d57f1a58df25b46d421857e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-vim"

RDEPENDS:${PN} += "ghostty \
vim"

inherit rpm
