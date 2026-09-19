SUMMARY = "Libraries, includes and more to develop SDL_image applications"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-devel-1.2.12+hg695-1.26.aarch64.rpm"
RPM_HASH = "86fd9d69cb73a028995ddd419157cab8b013277a25fbbd6a66ec256ce02f57574707d110524531e364680bd5ee6bcccde717277818d8edad0acd272be2458fd4"

RPROVIDES:${PN} += "SDL-image-devel \
libSDL-image-devel \
pkgconfig-SDL-image"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-image-1-2-0 \
pkgconfig-sdl"

inherit rpm
