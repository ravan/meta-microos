SUMMARY = "Wireplumber zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for various wpctl parameters."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-zsh-completion-0.5.17-1.1.noarch.rpm"
RPM_HASH = "4dd3a120d9b072fa464074f6272df5eedf9714d1f9556dad409e6e432b4d5148de230adb5fceec124145cd7dde295138c052422f1fc54edba4efb148bd30f8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wireplumber-zsh-completion"

RDEPENDS:${PN} += "wireplumber \
zsh"

inherit rpm
