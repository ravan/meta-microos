SUMMARY = "Astronomical ephemeris for the Sun, Moon and solar system planets"
DESCRIPTION = "wxEphe displays astronomical ephemeris for the Sun, the Moon and \
solar system planets, given the date and observer's location."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "wxEphe-1.8-1.17.aarch64.rpm"
RPM_HASH = "8f278a3bcd4effb17eedff616de8d6001e9834a6ef832483a20dcab7814aab8ae923c34c346c84c18f8900f69d983fa907faa1a713f400fadae5009378b2a500"

RPROVIDES:${PN} += "wxEphe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
