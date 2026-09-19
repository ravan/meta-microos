SUMMARY = "Zsh completion for pyenv"
DESCRIPTION = "Zsh command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "pyenv-zsh-completion-2.8.4-1.1.noarch.rpm"
RPM_HASH = "f26dfd954af5d5796c331b3ceccc708c277ea2b380f6e7485e0b4753aa0418d42192f7dd5f48359351af351b052857f7422c8e5ee758b5aa21498e7eb78f6bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pyenv-zsh-completion \
pyenv-zsh-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
