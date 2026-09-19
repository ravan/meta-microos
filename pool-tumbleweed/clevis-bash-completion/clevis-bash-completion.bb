SUMMARY = "Bash completion for Clevis"
DESCRIPTION = "This package provides Bash completion for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-bash-completion-21-1.6.aarch64.rpm"
RPM_HASH = "3f595d6d1b02b127fa4235d51a0d63723dfb8c4432469e89171f519dd9fc70ffcf967adda3798509b6f41882d161a93b42f8c8ed2f2a102859ba0ca8a6941814"

RPROVIDES:${PN} += "clevis-bash-completion"

RDEPENDS:${PN} += "bash-completion \
clevis"

inherit rpm
