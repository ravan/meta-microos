SUMMARY = "Performance Co-Pilot (PCP) test suite"
DESCRIPTION = "Quality assurance test suite for Performance Co-Pilot (PCP)."
LICENSE = "GPL-2.0+ & MIT"

PV = "6.3.8"

RPM_NAME = "pcp-testsuite-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "04102633ff2655eda62b6465240d4b778200c488d52272d6200e2dde853db396863951025d310c715154737eefcdf1e3f0afc6b51bf7d0772d04422c48086b1b"

RPROVIDES:${PN} += "group-pcpqa \
pcp-gui-testsuite \
pcp-testsuite \
perl-Slurm \
perl-Slurm--Hostlist \
user-pcpqa"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libstdc++.so.6 \
pcp \
pcp-devel"

inherit rpm
