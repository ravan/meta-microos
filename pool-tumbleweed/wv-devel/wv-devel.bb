SUMMARY = "Header files for wv"
DESCRIPTION = "Header files for wv."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-devel-1.2.9-4.8.aarch64.rpm"
RPM_HASH = "9e2417c3b4c1e82caf75f25d3c9a5959e4782760cb55a9edf4b99bc9afb79f9b77b1131431084c139bf607d5c58a9af21b0cee325899713dd76fc17414be41df"

RPROVIDES:${PN} += "pkgconfig-wv-1.0 \
wv-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsf-devel \
libwmf-devel \
libwv-1-2-4 \
pkgconfig-libgsf-1"

inherit rpm
