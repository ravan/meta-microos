SUMMARY = "Round Robin Database Tool to store and display time-series data"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). It stores the data in a compact way that will not \
expand over time, and it presents useful graphs by processing the data to \
enforce a certain data density. It can be used either via simple wrapper \
scripts (from shell or Perl) or via frontends that poll network devices and \
put a friendly user interface on it."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "899704e2ba95361ab0d1e3396cb219e9ecc54a55dfa36ff4f27d308a6ed77211543ca5cfad3c0bf437e798042020eae58370d04d56124be1e9e9687b37e001c6"

RPROVIDES:${PN} += "rrdtool"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
librrd.so.8"

inherit rpm
