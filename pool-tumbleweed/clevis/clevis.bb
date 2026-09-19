SUMMARY = "A pluggable framework for automated decryption"
DESCRIPTION = "Clevis is a pluggable framework for automated decryption. It can be used to \
provide automated decryption of data or even automated unlocking of LUKS \
volumes."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-21-1.6.aarch64.rpm"
RPM_HASH = "d7b09e5553b5b21a4f1a8a2b6abb07a4ac84dc3711a3c3559474071bdbca04f134a7565c55f055928d5beb693d0f58352aee665ddfb5140c9e45d4eec939e94e"

RPROVIDES:${PN} += "clevis"

RDEPENDS:${PN} += "/usr/bin/bash \
jose"

inherit rpm
