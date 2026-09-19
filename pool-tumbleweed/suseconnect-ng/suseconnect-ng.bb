SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "suseconnect-ng-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "f458bb473077d38a5250bf3ecba0fb2014451e73c64c5f0f55c5f1e24008897f333aa81e375fe963058ca79a0006f708e7fdf23fe92966dfb300907f49f0e9a3"

RPROVIDES:${PN} += "SUSEConnect \
suseconnect \
suseconnect-ng \
zypper-migration-plugin \
zypper-search-packages-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
coreutils \
dmidecode \
libc.so.6 \
pciutils \
util-linux \
zypper"

inherit rpm
