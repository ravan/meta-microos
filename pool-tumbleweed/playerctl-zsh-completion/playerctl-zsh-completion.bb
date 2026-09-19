SUMMARY = "ZSH completion for playerctl"
DESCRIPTION = "ZSH command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-zsh-completion-2.4.1-1.21.noarch.rpm"
RPM_HASH = "e602169cb54c9592526496800820f11a97b240b88f4962628dfee7c9ba8a4c8970205942b10440c856220f027ab45b5caed0b50769fb8f394abec6d409504634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
