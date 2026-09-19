SUMMARY = "Development files for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-devel-111-9.9.aarch64.rpm"
RPM_HASH = "2baa08c9d28d8276624b2fe045c35ecc2bfbdc8897ecb7d7c2cab87cffe3050754faa9b4beac7907b175d0647b739929b4b36c0d9c59f47c111e5b91d1b0950e"

RPROVIDES:${PN} += "ecryptfs-utils-devel \
pkgconfig-libecryptfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libecryptfs1"

inherit rpm
