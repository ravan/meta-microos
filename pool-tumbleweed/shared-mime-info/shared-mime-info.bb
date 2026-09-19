SUMMARY = "Shared MIME Database"
DESCRIPTION = "This package contains: \
 \
- The freedesktop.org shared MIME database spec. \
 \
- The merged GNOME and KDE databases, in the new format. \
 \
- The update-mime-database command, used to install new MIME data."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.1"

RPM_NAME = "shared-mime-info-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "ae056d1e0a043d18896d791ed51fb3deaccfaf22b48b307839761ea79704c39644d12c0c9bd26f3df66e827c6710374ec7c8d70fd62879522c025d05b8860cd3"

RPROVIDES:${PN} += "pkgconfig-shared-mime-info \
rpm-macro-mime-database-post \
rpm-macro-mime-database-postun \
shared-mime-info \
shared-mime-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
