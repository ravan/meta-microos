SUMMARY = "Zsh completion for wl-clipboard"
DESCRIPTION = "Zsh command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "wl-clipboard-zsh-completion-2.3.0-1.3.noarch.rpm"
RPM_HASH = "3e4d52c42b5cefa82839565dd8253367d3efa9b560e2b445026fae56e08cab5e6c246c8527242358905a3ac1cead9b6f6ea8b4a6b0702d5032f3bf4ea522a4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-zsh-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
