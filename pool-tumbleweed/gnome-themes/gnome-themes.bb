SUMMARY = "GNOME Themes"
DESCRIPTION = "GNOME themes, including Ximian Industrial and selected background \
images."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gnome-themes-3.0.0-23.4.noarch.rpm"
RPM_HASH = "058a0c58e18e93248ea4295eb0d617bd42b1f4c1599a4a0c8eb80531a93b86acb676b6d181130c10cd786eded01902b5bc7ec2fa67de3141eec9b6c0b80bca25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
