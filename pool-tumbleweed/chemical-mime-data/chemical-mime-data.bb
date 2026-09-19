SUMMARY = "A collection of data files for various chemical MIME types"
DESCRIPTION = "A collection of data files which tries to give support for various chemical \
MIME types (chemical/*) on Linux/UNIX desktops, such as KDE and GNOME. \
 \
Chemical MIMEs have been proposed in 1995, though it seems they have never \
been registered with IANA. However, they are widely used and the project's aim is, \
to support these important, but unofficial MIME types."
LICENSE = "LGPL-2.0-or-later"

PV = "0.1.94"

RPM_NAME = "chemical-mime-data-0.1.94-6.2.noarch.rpm"
RPM_HASH = "b3822ac19a3693de3fec746576a896cb4a95ee7477f9a6aab925de6e5317e3653a75aea2185002204b199b55b40a67b27fca3a3cdf7a7d04e3646dff6ed9f2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chemical-mime-data \
pkgconfig-chemical-mime-data"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shared-mime-info \
shared-mime-info"

inherit rpm
