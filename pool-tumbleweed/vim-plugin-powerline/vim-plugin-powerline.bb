SUMMARY = "Powerline VIM plugin"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and \
prompts."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "vim-plugin-powerline-2.8.4-3.5.noarch.rpm"
RPM_HASH = "9500b128be85eeb22152b500bd46962ff48151aee80b3e7d8e8553ae1f286afd91d60c3e5f23f1f27a2d6ae371aef2aeefa4280bf5d25409b2495d69e67baa0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-powerline"

RDEPENDS:${PN} += "powerline \
vim"

inherit rpm
