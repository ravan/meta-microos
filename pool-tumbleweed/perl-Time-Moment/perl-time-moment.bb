SUMMARY = "Represents a date and time of day with an offset from UTC"
DESCRIPTION = "'Time::Moment' is an immutable object that represents a specific date and \
time of day, along with an offset from UTC, within the ISO 8601 calendar \
system. Time is measured in nanoseconds since '0001-01-01T00Z'. Leap \
seconds are not accounted for in 'Time::Moment'; each day is assumed to \
have exactly '86,400,000,000,000' nanoseconds. \
 \
Time::Moment supports all epoch integers from '-62,135,596,800' to \
'253,402,300,799', allowing for nanosecond precision for any instant within \
the range '0001-01-01T00:00:00Z' to '9999-12-31T23:59:59Z'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.460.0"

RPM_NAME = "perl-Time-Moment-0.460.0-1.4.aarch64.rpm"
RPM_HASH = "3848e9e1b568f723cf2d2053688819bd3942ba3a214755c9fd965ba4f83d5f08c40f0c84f2614bcdaf5a8c53e2d54d1339b9075b46c3dde5b60e501522a002fa"

RPROVIDES:${PN} += "perl-Time--Moment \
perl-Time--Moment--Adjusters \
perl-Time-Moment"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
