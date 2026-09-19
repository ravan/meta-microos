SUMMARY = "X BrlAPI helper"
DESCRIPTION = "The xbrlapi utility is a helper to have BrlAPI work on a X system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "xbrlapi-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "1936fdcc4e685e9263ad35dbf0ba88429244dcf81c5709b093795d59ab6ee6c6a6557b58d32bcdf88b6bdd6bf8ee4e788c7f9828456b72540a937a0b7cf2d2bd"

RPROVIDES:${PN} += "xbrlapi"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libbrlapi.so.0.8 \
libc.so.6 \
libicuuc.so.78"

inherit rpm
