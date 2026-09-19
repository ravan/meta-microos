SUMMARY = "openSUSE Branding of mate-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Panel."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "mate-panel-branding-openSUSE-42.1-9.6.noarch.rpm"
RPM_HASH = "69caa0150a97dfd71f3bfeab25b58a43cdf187998a1ef4fc607730711e9f26e85c1d2e2fac0ef9a680db4806c5bd536a05177c4a3332ae4461034cac550cefb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding \
mate-panel-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
mate-applet-softupd \
mate-applets \
mate-menu \
mate-panel"

inherit rpm
