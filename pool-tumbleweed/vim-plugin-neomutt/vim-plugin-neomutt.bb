SUMMARY = "Neomutt plugin for Vim"
DESCRIPTION = "This plugin provides syntax for the neomutt configuration file. In addition, it \
sets the mail filetype to temporary mail files created by neomutt when writing \
or editing emails."
LICENSE = "Vim"

PV = "20260305"

RPM_NAME = "vim-plugin-neomutt-20260305-64.2.noarch.rpm"
RPM_HASH = "ab77b5e812384dfc5df3ab3aa839a823fcabf0a8524994ab56abb1e40bb7f1b21c43de2bc80ba3765b37315c51cf5822045448e84962aa7646222a756466500f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-neomutt"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
