SUMMARY = "GNOME Icon Theme"
DESCRIPTION = "The default GNOME icon theme."
LICENSE = "CC-BY-SA-3.0 | LGPL-3.0-or-later"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-3.12.0-6.4.noarch.rpm"
RPM_HASH = "d01d875769940686558a1e9ca787234edc1c55d49d152f28362de99e03b3a35bd328e730fd54f3fbf49b7c72ce03a6314aeda289047e29d3e19686902f3e0cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme \
gnome-icon-theme-devel \
pkgconfig-gnome-icon-theme"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gtk3-tools"

inherit rpm
