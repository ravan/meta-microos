SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Crash5-5.116.0-1.7.aarch64.rpm"
RPM_HASH = "07e025c38bdfcecf581939fa5958d156d0288e88ffcbd01a79bace6777c67553cd745ebd7cdfc55fce17e643114c7c870c271b6952feb712e6625933f7e03321"

RPROVIDES:${PN} += "libKF5Crash.so.5 \
libKF5Crash5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
