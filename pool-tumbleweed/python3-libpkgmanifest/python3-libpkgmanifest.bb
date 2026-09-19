SUMMARY = "Python 3 bindings for the libpkgmanifest library"
DESCRIPTION = "Python 3 bindings for the libpkgmanifest library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.9"

RPM_NAME = "python3-libpkgmanifest-0.5.9-2.5.aarch64.rpm"
RPM_HASH = "a06a2782f640c9577d001e889f5530780217efa894417c9619e5c22a131682b353182453135b5195eb9f15d2ff84c774a39d3820873017c56b8e294bcc4a4ad7"

RPROVIDES:${PN} += "python3-libpkgmanifest \
python3.13dist-libpkgmanifest \
python3dist-libpkgmanifest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpkgmanifest.so.0 \
libpkgmanifest0 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
