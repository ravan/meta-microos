SUMMARY = "An Image Viewer and Browser for GNOME - Development Files"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.10"

RPM_NAME = "gthumb-devel-3.12.10-2.6.aarch64.rpm"
RPM_HASH = "f70f74fe4f88a4115ac8583ce784c4c02a195e4b4d797e1c2e385c3cdef0571a6ce9ac07bbbadb499d87f8be4395ead27034719f0e407b2e8656c37151a40186"

RPROVIDES:${PN} += "gthumb-devel \
pkgconfig-gthumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gthumb \
pkgconfig-gtk+-3.0"

inherit rpm
