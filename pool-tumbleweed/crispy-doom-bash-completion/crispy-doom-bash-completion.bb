SUMMARY = "Crispy Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support crispy-doom."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "crispy-doom-bash-completion-7.1-1.6.noarch.rpm"
RPM_HASH = "6c34e386205431e2f9bcb5901b26696cb0b391f6e81e7e50f999f43dc67a10d25a721c9198d509a57ee56e9c0e9c648bcd972c9d65e24fabe1b8943f4dfa8f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crispy-doom-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
