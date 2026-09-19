SUMMARY = "Quaternion class with overloaded operators for Octave"
DESCRIPTION = "Quaternion class with overloaded operators. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "octave-forge-quaternion-2.4.0-2.10.aarch64.rpm"
RPM_HASH = "98c3d618aed190af4359a6140a162af6aaca65b7b910120de1ffc872c0eec6b391589cde411d93def38bbf3300e7c45337bef27c80a98f2140b64c0e7dec1dbf"

RPROVIDES:${PN} += "octave-forge-quaternion"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
