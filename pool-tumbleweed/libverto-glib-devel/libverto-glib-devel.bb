SUMMARY = "Development files for libverto-glib1"
DESCRIPTION = "The libverto-glib-devel package contains libraries and header files \
for developing applications that use libverto-glib."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-glib-devel-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "e186a04de3c594e291690efed1e1479362798acc0ffee3772c2cae4f3d7517791be491421954b81d264acfb4936d657df6428bdd43bb441d235340936aa86716"

RPROVIDES:${PN} += "libverto-glib-devel \
pkgconfig-libverto-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libverto-devel \
libverto-glib1 \
pkgconfig-libverto"

inherit rpm
