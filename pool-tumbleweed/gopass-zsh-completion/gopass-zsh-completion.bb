SUMMARY = "Zsh completion for gopass"
DESCRIPTION = "Manage your credentials with ease. In a globally distributed team, on multiple devices or fully offline on an air gapped machine. \
 \
Works everywhere - The same user experience on Linux, MacOS, *BSD or Windows \
Built for teams - Built from our experience working in distributed development teams \
Full autonomy - No network connectivity required, unless you want it \
 \
This package holds the shell completion for zsh."
LICENSE = "MIT"

PV = "1.17.2"

RPM_NAME = "gopass-zsh-completion-1.17.2-1.1.noarch.rpm"
RPM_HASH = "73832141b97e2b9f8e556f40b16cbf2b77e984b14ba33ef4ee65bcfd69dfea1b1d942bba87b6d985b1e1a2871f2b16be1c8722d662f834834aa889ec43d6fb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gopass-completion-zsh \
gopass-zsh-completion"

RDEPENDS:${PN} += "gopass"

inherit rpm
