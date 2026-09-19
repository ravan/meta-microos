SUMMARY = "Bats plugin for Vim"
DESCRIPTION = "This Vim plugin provides support for editing Bats (Bash Automated Testing \
System) test files."
LICENSE = "Vim"

PV = "0.10.0"

RPM_NAME = "vim-plugin-bats-0.10.0-64.2.noarch.rpm"
RPM_HASH = "6da8cae068d8676cf840afd6ed31eb50f8254c9dc44f7257200cfdfc0e23edc9f86c05ff2770cce08f5f76f8e279557b66574925c95d82e3399172ccc7998c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-bats"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
