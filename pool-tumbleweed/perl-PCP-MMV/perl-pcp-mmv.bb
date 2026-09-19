SUMMARY = "Performance Co-Pilot (PCP) Perl bindings for PCP Memory Mapped Values"
DESCRIPTION = "The PCP::MMV module contains the Perl language bindings for \
building scripts instrumented with the Performance Co-Pilot \
(PCP) Memory Mapped Value (MMV) mechanism. \
This mechanism allows arbitrary values to be exported from an \
instrumented script into the PCP infrastructure for monitoring \
and analysis with pmchart, pmie, pmlogger and other PCP tools."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "perl-PCP-MMV-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "68f98c06b856260945fa81daf4e412463a0e15499be0692987aaf463d79af3ace8e75fbcf2f8c3817bbaf26bb5bcc403f89a39194a7fd1c5e4fbbd3040942f8d"

RPROVIDES:${PN} += "perl-PCP--MMV \
perl-PCP-MMV"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-mmv.so.1 \
libpcp3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
