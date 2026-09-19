SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package is needed to \
build programs written with Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg44-devel-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "9d5959cc31aa0e41fd10a9a7531f10e1687895e2ed9d441c8562ad5b1b896391da9f4257087723cc599170848e015e8fb3141a150c975a66d834f119abfc0203"

RPROVIDES:${PN} += "allegro-devel \
liballeg-devel \
liballeg44-devel \
pkgconfig-allegro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
allegro44 \
ld-linux-aarch64.so.1 \
liballeg4-4 \
libc.so.6 \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xext \
pkgconfig-xproto \
pkgconfig-xxf86vm"

inherit rpm
