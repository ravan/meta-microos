SUMMARY = "Bash completion for partclone"
DESCRIPTION = "Bash command-line completion support for partclone."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.50"

RPM_NAME = "partclone-bash-completion-0.3.50-1.1.noarch.rpm"
RPM_HASH = "e9a5e894651941fa014f76975721573e2bdaa4582f5b13e2c78abd16e0989325fbe999ebc62919d5c759ce4f6b0c7138ca62ab82799ec632b1bab1af99215a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "partclone-bash-completion"

RDEPENDS:${PN} += "bash-completion \
partclone"

inherit rpm
