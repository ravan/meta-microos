SUMMARY = "XFCE4 multiload-ng package"
DESCRIPTION = "Provides required files for XFCE4 panel integration."
LICENSE = "GPL-2.0-or-later"

PV = "git20210103.743885d"

RPM_NAME = "multiload-ng-xfce4-git20210103.743885d-3.3.aarch64.rpm"
RPM_HASH = "3e2965dec5cb6a123f7bc237e2cc957c053231977930662589817244cdf283cf5bffb2ed3fb1dd6df203840ec8cdeeed87d2c37c020085693eecc6d303726a06"

RPROVIDES:${PN} += "libmultiload-ng.so \
multiload-ng-xfce4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4util.so.7 \
multiload-ng-base"

inherit rpm
