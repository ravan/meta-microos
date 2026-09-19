SUMMARY = "Development documentation for xdg-desktop-portal"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
This package contains convenience documentation for developers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.1"

RPM_NAME = "xdg-desktop-portal-devel-docs-1.22.1-1.2.aarch64.rpm"
RPM_HASH = "935e1734f9633afac542e188dc2e1ae5e8d2d228553089fa77f237ac97593dcb78699abe3f3c40d0ed4383c93797b21fd5158379e052c1c17ea6e4084b018c97"

RPROVIDES:${PN} += "xdg-desktop-portal-devel-docs"

RDEPENDS:${PN} += "/usr/bin/fusermount3"

inherit rpm
