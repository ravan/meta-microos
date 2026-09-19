SUMMARY = "Cut-and-Paste-Detector for Perl code"
DESCRIPTION = "The module's main purpose is to report repeated text fragments (typically \
Perl code) that could be considered for isolation and/or abstraction in \
order to reduce multiple copies of the same code (aka cut and paste code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Code-DRY-0.10-1.41.aarch64.rpm"
RPM_HASH = "166e67fb383143a6871629b24d4b1de2d53b5148b3f8a44bb966ec71eacff168d9c7a657906acb4c1e661d628dbeca8c036f5d3d11576e4741fe9684f66dcd39"

RPROVIDES:${PN} += "perl-Code--DRY \
perl-Code-DRY"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--CBuilder \
perl-Module--Build \
perl-TAP--Harness"

inherit rpm
