SUMMARY = "Verilog language utilities and parsing"
DESCRIPTION = "Verilog language utilities and parsing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.482.0"

RPM_NAME = "perl-Verilog-Perl-3.482.0-1.4.aarch64.rpm"
RPM_HASH = "317d61e11ae5270666ff9640ac6cc802378237ec9d2973a2a6df321179df513234ec5820ec0d64a0692a305c3abe63b23ef4a66137bc3d81d176dd970e802cb0"

RPROVIDES:${PN} += "perl-Verilog--EditFiles \
perl-Verilog--Getopt \
perl-Verilog--Language \
perl-Verilog--Netlist \
perl-Verilog--Std \
perl-Verilog-Perl \
perl-process \
perl-semaphore \
perl-std"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Pod--Usage"

inherit rpm
