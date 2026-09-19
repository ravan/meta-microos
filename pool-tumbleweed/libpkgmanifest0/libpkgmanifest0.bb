SUMMARY = "Library for working with RPM manifests"
DESCRIPTION = "This library provides functionality for parsing and serializing \
RPM package manifest files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.9"

RPM_NAME = "libpkgmanifest0-0.5.9-2.5.aarch64.rpm"
RPM_HASH = "1a2db2c881ff8da2daedfd1cf104817458c0511c5128e2afa0920f4c47d3df86754ed22e668c162634d4cded6fb406931f6549c8ec89fcc0a49f0400da12d604"

RPROVIDES:${PN} += "libpkgmanifest.so.0 \
libpkgmanifest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
