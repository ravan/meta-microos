SUMMARY = "Development files for libimobiledevice-glue"
DESCRIPTION = "The libimobiledevice-glue-devel package contains libraries and header files for \
developing applications that use libimobiledevice-glue."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2+git0.20250604"

RPM_NAME = "libimobiledevice-glue-devel-1.3.2+git0.20250604-1.5.aarch64.rpm"
RPM_HASH = "8f623826880316ff9f901bf245d0a5bbbd04fa0ce0eaa374d1bd64b984444c8c5b2b23b687a4f2bd319bc61a15d9f5d6993a39d40bcdc5f9b627e45fcc23484e"

RPROVIDES:${PN} += "libimobiledevice-glue-devel \
pkgconfig-libimobiledevice-glue-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-glue-1-0-0 \
pkgconfig-libplist-2.0"

inherit rpm
