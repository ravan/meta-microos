SUMMARY = "Thunderbird's upstream OpenPGP implementation"
DESCRIPTION = "Thunderbird's upstream OpenPGP implementation."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "MozillaThunderbird-openpgp-librnp-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "e2c2ff0f25b29bdd92500493346288e497bd2e3f455244fc8188b83964c7b7dbb1cb8695ed0823afb85794af660b1394e7dfd088fac534ecc893dd5d52612c95"

RPROVIDES:${PN} += "MozillaThunderbird-openpgp \
MozillaThunderbird-openpgp-librnp"

RDEPENDS:${PN} += "MozillaThunderbird \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
