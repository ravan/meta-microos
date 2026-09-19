SUMMARY = "Development files for libverto-libev1"
DESCRIPTION = "The libverto-libev-devel package contains libraries and header \
files for developing applications that use libverto-libev."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-libev-devel-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "fab6f5014d530f6178be07f46e7a6d2cd96cda85807ad1e61b2a60606c5724188370db64da65fc2c5b953ee555ef9fc0c477bd033926d7d8b1e9360331d87366"

RPROVIDES:${PN} += "libverto-libev-devel \
pkgconfig-libverto-libev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libverto-devel \
libverto-libev1 \
pkgconfig-libverto"

inherit rpm
