SUMMARY = "Development files for libmodplug"
DESCRIPTION = "Files needed to program against libmodplug."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug-devel-0.8.9.0+git20170610.f6dd59a-3.9.aarch64.rpm"
RPM_HASH = "46e74c58f19c2a90c88d4dbdba0bde050ff67e3840d8a6537a64a71efe7fee9038ddc2dc5e9263e5adf0a713121e45e1743fefa97fc972ebb4f4ff26983d8ad5"

RPROVIDES:${PN} += "libmodplug-devel \
pkgconfig-libmodplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodplug1"

inherit rpm
