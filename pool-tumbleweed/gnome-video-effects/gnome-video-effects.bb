SUMMARY = "Collection of GStreamer effects"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gnome-video-effects-0.6.0-1.9.noarch.rpm"
RPM_HASH = "ecc9d76b52ee97967bbfd26b44af88bf21793054915387963c495d405b9d626f98ba82967990db7b3264a0e2cc9de2f9e3bc2bd9699e76079a4eb4997df1a1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects"

RDEPENDS:${PN} += ""

inherit rpm
