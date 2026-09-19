SUMMARY = "Perl interface to the libgd graphics library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.860.0"

RPM_NAME = "perl-GD-2.860.0-2.4.aarch64.rpm"
RPM_HASH = "42f286d640e973762c433677066c7486bf6217170f2dae9907a61f63be05785d408c28e23f0b94eab10ec59f8359bf338f39f21f9f9705093412b9f4b0a6e001"

RPROVIDES:${PN} += "perl-GD \
perl-GD--Group \
perl-GD--Image \
perl-GD--Polygon \
perl-GD--Polyline \
perl-GD--Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
gd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
