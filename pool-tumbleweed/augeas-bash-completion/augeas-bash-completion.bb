SUMMARY = "Bash completion for augeas"
DESCRIPTION = "bash command line completion support for augeas."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-bash-completion-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "6e2b2678e23047779c7e32c5822226a02d20a9729416ffa8f1d01ebbc7e3f687adb8a710d4b155a3e8abeb383267fd20ac5b53f27b4d05fdb6182d5f087ea970"

RPROVIDES:${PN} += "augeas-bash-completion"

RDEPENDS:${PN} += "augeas \
bash-completion"

inherit rpm
