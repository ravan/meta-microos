SUMMARY = "Polygon clipping in 2D"
DESCRIPTION = "'Clipper' is a C++ (and Delphi) library that implements polygon clipping."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Math-Clipper-1.29-1.43.aarch64.rpm"
RPM_HASH = "9eb35a71d351f3fb56cc9c4957586def8bbd01ed4afd46cb930088b7c194fd05367158e4c52cfededaba8d5f3f12794f1c48d11cd1cea874942a8c466e35cd1d"

RPROVIDES:${PN} += "perl-Math--Clipper \
perl-Math-Clipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
