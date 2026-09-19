SUMMARY = "Development files for chafa"
DESCRIPTION = "Development files for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.18.2"

RPM_NAME = "chafa-devel-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "51a14e1bc6dc606f2547d36f6fe5c6d28e397f70dfc312802764d3683187c384477bad85afa5e924bc7c4a2d03a69dd04cf38a6abe5cc091d48d760e2cdd73ed"

RPROVIDES:${PN} += "chafa-devel \
pkgconfig-chafa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchafa0 \
pkgconfig-glib-2.0"

inherit rpm
