SUMMARY = "Disk and net statistic monitoring systemtap scripts - GTK GUI"
DESCRIPTION = "GTK GUI that can control tuned and provide simple profile editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-gtk-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "cc17bd570dfe3b9156952a0395151bd7403cd7698937624c32c76e3f61f64d4e096ad30fce323b6bc466faea584ce2d8280a51df7d47cb58f42d1dc8f95e04fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
python-abi \
python3-gobject \
tuned \
typelib-Gtk"

inherit rpm
