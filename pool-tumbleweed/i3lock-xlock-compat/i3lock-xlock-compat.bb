SUMMARY = "Xlock-compatibility script which calls i3lock"
DESCRIPTION = "This package provides a script /usr/bin/xlock which calls i3lock to lock your screen. \
This is handy for hard-coded screen-saver invocations e.g. in XFCE4, so you can use \
i3lock instead of xlock with them."
LICENSE = "BSD-3-Clause"

PV = "2.16"

RPM_NAME = "i3lock-xlock-compat-2.16-1.5.aarch64.rpm"
RPM_HASH = "51206cced7240dce1f44aa6c256c0f5ded106837b6e91a451f5ae94c016390ff517de167a7c759821a2c8978c6cb2a964a2e92b2196355ebb6004f9f5b8da2e6"

RPROVIDES:${PN} += "i3lock-xlock-compat"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick \
xdpyinfo"

inherit rpm
