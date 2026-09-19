SUMMARY = "ZSH completion for radare2"
DESCRIPTION = "zsh shell completions for radare2."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "6.2.2"

RPM_NAME = "radare2-zsh-completion-6.2.2-1.1.noarch.rpm"
RPM_HASH = "579eaa2a064fc5431208b97300f6ff6f89fd1e4cb16c168a97da28f0ffdb9e4a21f71175d8581b04f35d9f053549754aa45d05aaee581ea53cad135f9a8cc3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "radare2-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
