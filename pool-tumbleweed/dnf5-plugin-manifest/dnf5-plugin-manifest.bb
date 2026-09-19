SUMMARY = "DNF5 plugin for working with RPM package manifest files"
DESCRIPTION = "DNF5 plugin for working with RPM package manifest files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5-plugin-manifest-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "8df8b861a3b0ae6efcfc3149eb8b50a26e81b36e785677ea8ab0b0ccf0ff8f6cf81fe86b6941ddf3ec019bb066865ebdfb77d463ffb54a1c5c3b08c4927714a4"

RPROVIDES:${PN} += "dnf5-command-manifest \
dnf5-plugin-manifest"

RDEPENDS:${PN} += "dnf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libpkgmanifest.so.0 \
libstdc++.so.6"

inherit rpm
