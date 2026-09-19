SUMMARY = "Zsh Completion for neocmakelsp"
DESCRIPTION = "Zsh command-line completion support for neocmakelsp."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "neocmakelsp-zsh-completion-0.9.0-1.5.noarch.rpm"
RPM_HASH = "0c7d974622182454a127c16c7e5f0904e613d3c6e0b1fb743f77463ab844f9b072764864311ec664d72f3d31b9684ef16faa6aefda5d6eb5bbd50235ae3db439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neocmakelsp-zsh-completion"

RDEPENDS:${PN} += "neocmakelsp \
zsh"

inherit rpm
