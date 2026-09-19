SUMMARY = "Zsh Completion for direnv"
DESCRIPTION = "Zsh command-line completion support for direnv."
LICENSE = "MIT"

PV = "2.37.1"

RPM_NAME = "direnv-zsh-completion-2.37.1-1.8.noarch.rpm"
RPM_HASH = "20ac197c009f540e853f2fcb798c3a50e7abbe902295614b6c0c812c70ecaff1a2198ef39294f9b8188f9a3c59136a24e39803165432e6ce3f8818a05e13fec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "direnv-zsh-completion"

RDEPENDS:${PN} += "direnv \
zsh"

inherit rpm
