SUMMARY = "Bash completion for sequoia-sq"
DESCRIPTION = "Bash command line completion support for sequoia-sq"
LICENSE = "LGPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "sequoia-sq-bash-completion-1.4.0-4.1.noarch.rpm"
RPM_HASH = "383aaa786c24667d9af18b67385a174b01396387d7999deb7bfc9e12123128353ff3913b3d6a660ea94eb4adb375119b8703df0b725c959d642043968e3f5c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sq-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sequoia-sq"

inherit rpm
