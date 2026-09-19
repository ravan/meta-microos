SUMMARY = "Zsh completion for SwayNotificationCenter"
DESCRIPTION = "Zsh command line completion support for SwayNotificationCenter"
LICENSE = "GPL-3.0-only"

PV = "0.12.6"

RPM_NAME = "SwayNotificationCenter-zsh-completion-0.12.6-1.3.noarch.rpm"
RPM_HASH = "aa192e92801914ce802c33d3e93091ec2c942ed50a9dfb034b18eebaabecb85db7daa7fd778ece5779241f40b532e97e7e0a47a9f1465058a8e597f6bd56e046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SwayNotificationCenter-zsh-completion \
swaync-zsh-completion"

RDEPENDS:${PN} += "SwayNotificationCenter \
zsh"

inherit rpm
