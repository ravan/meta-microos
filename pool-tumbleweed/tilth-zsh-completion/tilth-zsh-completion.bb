SUMMARY = "Zsh completion for tilth"
DESCRIPTION = "Zsh command line completion for tilth, generated during the build."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & Zlib"

PV = "0.10.1"

RPM_NAME = "tilth-zsh-completion-0.10.1-1.1.noarch.rpm"
RPM_HASH = "a1635a5a3fe6ed8c490c341d87821111177e0b4725365aa56c9fa10a6acf2a18e3134521cc45196dc0395c0b1d4606b2f99b7928c94fd2ed11dc3dbcd92c0e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tilth-zsh-completion"

RDEPENDS:${PN} += "tilth"

inherit rpm
