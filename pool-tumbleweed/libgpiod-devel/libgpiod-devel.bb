SUMMARY = "Devel files for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Devel files part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod-devel-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "c990b83977c76102fd41d5dfaa7e23e458f93cd9b7e90f864c4decf0431d4c472b198e1c6e08c14272a96b1ce587d9d24933f6104d95827eca39e5b7dd25ef0e"

RPROVIDES:${PN} += "libgpiod-devel \
pkgconfig-gpiod-glib \
pkgconfig-libgpiod \
pkgconfig-libgpiodcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpiod \
libgpiod3 \
libgpiodcxx2 \
libgpiosim1 \
pkgconfig-libgpiod"

inherit rpm
