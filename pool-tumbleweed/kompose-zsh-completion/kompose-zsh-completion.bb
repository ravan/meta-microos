SUMMARY = "Zsh Completion for kompose"
DESCRIPTION = "zsh command line completion support for kompose."
LICENSE = "Apache-2.0"

PV = "1.38.0"

RPM_NAME = "kompose-zsh-completion-1.38.0-1.7.noarch.rpm"
RPM_HASH = "f6e983282c0f71482b07196ef0511ba0bf83af4627482cc8fb114f3a1d21dc6b7903a3e33d4ebb1642aefbee50135f9647ab6d57987c6a872425debeb355acdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-zsh-completion"

RDEPENDS:${PN} += "kompose"

inherit rpm
