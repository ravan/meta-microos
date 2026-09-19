SUMMARY = "ZSH Completion for ripgrep"
DESCRIPTION = "The official zsh completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "15.2.0"

RPM_NAME = "ripgrep-zsh-completion-15.2.0-1.3.noarch.rpm"
RPM_HASH = "3458100441f70238da8b6d4f8120025a86e5287211a0c60af52e3968d25c26642764af023d339d4c1324fcee720109b528179286ef07d329541b207524165d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-zsh-completion"

RDEPENDS:${PN} += "ripgrep"

inherit rpm
