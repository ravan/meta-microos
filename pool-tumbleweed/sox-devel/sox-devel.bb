SUMMARY = "Sound Conversion Tools and Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "14.4.2"

RPM_NAME = "sox-devel-14.4.2-9.11.aarch64.rpm"
RPM_HASH = "672e9c8452012a5b57a0fb91fc5244dc7fff3fb6ce1056c7ca8f283f7c06733ba81378d4a1389f703c66f1b0de2e0c052b4b8181a0d38d91164cecb25c5318bc"

RPROVIDES:${PN} += "pkgconfig-sox \
sox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsox3"

inherit rpm
