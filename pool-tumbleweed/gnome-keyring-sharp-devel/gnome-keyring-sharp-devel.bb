SUMMARY = "Managed implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to retrieve \
and store confidential information such as passwords, notes or network \
services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-devel-1.0.2-27.4.aarch64.rpm"
RPM_HASH = "34b2858a6e0119c922c4b3a4832695f98d1b5f556d7b5a96bb18ffbd969c92f18181794a041ab5070b782f5f7e75f13c91ea850055a25749e1bfe8a55bdf5092"

RPROVIDES:${PN} += "gnome-keyring-sharp-devel \
pkgconfig-gnome-keyring-sharp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-keyring-sharp \
pkg-config"

inherit rpm
