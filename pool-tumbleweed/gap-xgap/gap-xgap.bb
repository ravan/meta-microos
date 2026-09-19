SUMMARY = "GAP: Graphical user interface for GAP"
DESCRIPTION = "The XGAP package allows to use graphics in GAP."
LICENSE = "GPL-2.0-or-later"

PV = "4.33"

RPM_NAME = "gap-xgap-4.33-1.6.aarch64.rpm"
RPM_HASH = "1065d5dfb9d542cf63edc5d206bffa30b506819a344270782de67735d0b8eb82ad7b88fbb2db864db85ec210fd40126b806c53d5e56951eb62281c1806e3a971"

RPROVIDES:${PN} += "gap-xgap"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gap-core \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
