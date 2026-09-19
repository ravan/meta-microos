SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKOpeningHours1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5e522752106b73da98676d7ea63ea392da83731a54253ed3159004bdadd3385cf1a4d6117e23ffc8b0504058aeaac213bc51ef2b007c218c22f140727388d442"

RPROVIDES:${PN} += "libKOpeningHours.so.1 \
libKOpeningHours1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kopeninghours \
ld-linux-aarch64.so.1 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
