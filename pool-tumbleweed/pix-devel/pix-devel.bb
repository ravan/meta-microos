SUMMARY = "Image viewer and browser utility -- Development Files"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "pix-devel-3.4.7-1.8.aarch64.rpm"
RPM_HASH = "dc73015dd12ed4e84611a1b197f9ff67badf80887d8520eea5ad17c23e6eb320a4d40c971b2fbaa9ebda8899c116bff2e2850b180fba2424eb48b298b1e5778a"

RPROVIDES:${PN} += "pix-devel \
pkgconfig-pix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pix \
pkgconfig-gtk+-3.0"

inherit rpm
