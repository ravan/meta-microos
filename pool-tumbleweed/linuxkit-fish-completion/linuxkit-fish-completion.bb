SUMMARY = "Fish Completion for linuxkit"
DESCRIPTION = "Fish command line completion support for linuxkit."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "linuxkit-fish-completion-1.8.2-1.6.noarch.rpm"
RPM_HASH = "be2a4759395154ec65f306fa5847b0f7b6a31adb6731192dc7f3b8457b90adfac994440168eaed9eff6a133309032cff5acfc4dfb21449755223fd65ad21053e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxkit-fish-completion"

RDEPENDS:${PN} += "linuxkit"

inherit rpm
