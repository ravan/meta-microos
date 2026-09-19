SUMMARY = "Thumbnailer for folders"
DESCRIPTION = "A thumbnailer to show custom folder thumbnails in Thunar"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "tumbler-folder-thumbnailer-4.20.2-1.1.noarch.rpm"
RPM_HASH = "65f06343e834b071d360de6c52af9cade9024065b146eb6254943efc81882d0c0d09583439716fc646b60ef8d21fd13232f43a2d7e32874ce329fe3ec626ed1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbler-folder-thumbnailer"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick"

inherit rpm
