SUMMARY = "Installs all plugins for libextractor"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
This package triggers the installation of all available file format plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-1.14-1.2.noarch.rpm"
RPM_HASH = "ae9c5c8d688206722443635f25267026ddf0febffecd7a63d3a4245db8068d0171710ddca1ac5d21b0e399a40dd9e8caa93613e56112fc988827d2bf6c9fd375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libextractor-plugins"

RDEPENDS:${PN} += "libextractor-plugins-archive \
libextractor-plugins-base \
libextractor-plugins-exiv2 \
libextractor-plugins-flac \
libextractor-plugins-gif \
libextractor-plugins-gstreamer \
libextractor-plugins-html \
libextractor-plugins-jpeg \
libextractor-plugins-mime \
libextractor-plugins-mpeg \
libextractor-plugins-ogg \
libextractor-plugins-ole2 \
libextractor-plugins-pdf \
libextractor-plugins-rpm \
libextractor-plugins-thumbnailgtk \
libextractor-plugins-tiff \
libextractor-plugins-vlc"

inherit rpm
