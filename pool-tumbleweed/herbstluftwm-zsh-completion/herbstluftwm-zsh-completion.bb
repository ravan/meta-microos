SUMMARY = "Zsh completion for herbstluftwm"
DESCRIPTION = "ZSH completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "herbstluftwm-zsh-completion-0.9.6-1.3.noarch.rpm"
RPM_HASH = "de071de0928cf95e659a5d420dbef29ab7825d1406df4f6987ec88b099c9f905edac3c1941f67d0ab36e9806774a2a2b6794557b4d5e60d479985ecf26e6286f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-zsh-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
