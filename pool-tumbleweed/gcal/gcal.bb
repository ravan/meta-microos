SUMMARY = "A Program for Printing Calendars"
DESCRIPTION = "Gcal is a program for printing calendars.  Gcal displays a calendar for \
a month or a year, eternal holiday lists, and fixed date lists.  The \
program correctly omits the dates that were skipped when the current \
Gregorian calendar replaced the earlier Julian calendar."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-4.1-5.6.aarch64.rpm"
RPM_HASH = "7cd547b1caf52ee766749eff0a2fd140d4911dcb5b5aa3e1a7b8d6b63a529d05c4a6b8010ddef1a3e6f39156da29df71c896f69692a590715974779230aa4656"

RPROVIDES:${PN} += "gcal"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
