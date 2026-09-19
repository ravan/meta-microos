SUMMARY = "Zsh Completion for sile"
DESCRIPTION = "Zsh command-line completion support for sile."
LICENSE = "MIT"

PV = "0.15.13"

RPM_NAME = "sile-zsh-completion-0.15.13-2.7.noarch.rpm"
RPM_HASH = "88d6432bb41a10cff1cf4554f619b32266251ec43b3b570462cef1836e3b2b7d7ac59576ef228808c4d95e57af4f8ef704f51ab15512b55217103fbed63daadb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sile-zsh-completion"

RDEPENDS:${PN} += "sile \
zsh"

inherit rpm
