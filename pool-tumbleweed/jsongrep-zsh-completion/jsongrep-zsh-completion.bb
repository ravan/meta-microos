SUMMARY = "Zsh Completion for jsongrep"
DESCRIPTION = "zsh command line completion support for jsongrep."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "jsongrep-zsh-completion-0.9.0-1.4.noarch.rpm"
RPM_HASH = "439d54aec41fed96da26af216f766215ecaf6e45dada04176db3ca88f57a16c72f18171495351489c1b75fdf86df1220bd874345587b68986dc6aae5678db74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsongrep-zsh-completion"

RDEPENDS:${PN} += "jsongrep \
zsh"

inherit rpm
