SUMMARY = "Development files for UDisks"
DESCRIPTION = "This package contains the development files for the library libUDisks2, a \
dynamic library, which provides access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "libudisks2-0-devel-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "6acf473eca66bb0dedb8f170f6008781a017a7bb1aa0596fdbc6f9b1ff6c04263e91cb98efaab7ab4f660f1f00751eef2061ce7430dd2def7b939dac5686c566"

RPROVIDES:${PN} += "libudisks2-0-devel \
pkgconfig-udisks2 \
pkgconfig-udisks2-btrfs \
pkgconfig-udisks2-lsm \
pkgconfig-udisks2-lvm2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libudisks2-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-udisks2"

inherit rpm
