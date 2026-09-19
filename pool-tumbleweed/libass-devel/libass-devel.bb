SUMMARY = "Development files for libass, a subtitle rendering library"
DESCRIPTION = "This package is needed if you want to develop / compile against libass."
LICENSE = "ISC"

PV = "0.17.5"

RPM_NAME = "libass-devel-0.17.5-1.3.aarch64.rpm"
RPM_HASH = "5b1e9d176b71086de695bcb9adf0a09775616bc8fb3d09a82c64cea3ca365f6588ffff10580720415af380d9814d82bcc6155f71ba412f5c79c09faf866a48b9"

RPROVIDES:${PN} += "libass-devel \
pkgconfig-libass"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libass9 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-harfbuzz \
pkgconfig-libunibreak"

inherit rpm
