SUMMARY = "Simple Perl script for automating the process of benchmarking a web server"
DESCRIPTION = "Autobench is a simple Perl script for automating the process of benchmarking \
a web server (or for conducting a comparative test of two different web \
servers). The script is a wrapper around  httperf. Autobench runs httperf a \
number of times against each host, increasing the number of requested \
connections per second on each iteration, and extracts the significant data \
from the httperf output, delivering a CSV or TSV format file which can be \
imported directly into a spreadsheet for analysis/graphing."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "autobench-2.1.2-3.23.aarch64.rpm"
RPM_HASH = "f6fb87eedf99ca629ebd338051d2c7448d280a61dc373e096afdeca3dc7e69724c3e65fcbd9467c6c2961c653c241bd92a1d2678c0e3321d7785258afa0cae6d"

RPROVIDES:${PN} += "autobench \
config-autobench"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gawk \
gnuplot \
httperf \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
