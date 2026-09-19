SUMMARY = "Bash Completion for libsixel"
DESCRIPTION = "Bash command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.5"

RPM_NAME = "libsixel-bash-completion-1.10.5-2.7.noarch.rpm"
RPM_HASH = "218d6990b09f9fecd3b594ab8545d99f2512bb36a774dc5dfec417f3852a587d46754ea3011e2a16b993f7307cd275789ffa4430e1c1717a984ced8e9db366ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-bash-completion"

RDEPENDS:${PN} += "bash-completion \
libsixel-utils"

inherit rpm
