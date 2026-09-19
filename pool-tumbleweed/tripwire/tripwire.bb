SUMMARY = "A tool to observe the filesystem"
DESCRIPTION = "By using tripwire, it is possible to observe the filesystem. tripwire \
generates a database, controlled by a configuration file, of all \
files, their checksums, etc. and it reports changes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3.7"

RPM_NAME = "tripwire-2.4.3.7-2.10.aarch64.rpm"
RPM_HASH = "3b49c8aa9c266db383c780cae9b5b6e4391f0cc4be0d5fc96eb9bf16e7e52eb7f11c6f6552a5e8c4238548667ace970b9b7698fbe8f1922371b3e3b56b830535"

RPROVIDES:${PN} += "Tripwire \
config-tripwire \
tripwire"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
