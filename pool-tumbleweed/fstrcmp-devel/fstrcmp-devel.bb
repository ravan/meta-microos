SUMMARY = "Development files for libfstrcmp"
DESCRIPTION = "The fstrcmp-devel package contains libraries and header files for \
developing applications that use libfstrcmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "fstrcmp-devel-0.7.D001-1.25.aarch64.rpm"
RPM_HASH = "bfde4e0d863c01f6ef221f83c7dd13f857dd4e9282e97c67dccc046d917cfa7bff8e2eb29d154f357e45b14627f972fd1b643aac6ee75fb7e9ed04290f89c84d"

RPROVIDES:${PN} += "fstrcmp-devel \
pkgconfig-fstrcmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfstrcmp0"

inherit rpm
