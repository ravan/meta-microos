SUMMARY = "Graph Visualization CGI Script for vnstat"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions. \
 \
This package contains a CGI script that visualizes graphs of the \
collected traffic statistics."
LICENSE = "GPL-2.0-only"

PV = "2.13"

RPM_NAME = "vnstat-cgi-2.13-1.9.aarch64.rpm"
RPM_HASH = "397f7e945a74bf40773356fde6e47a0cdcb1cc2d1614569ed68904ac48859b61b420564335caf9cdd3a65151f6784d03a6a3056d4987e758d97983dff7d6996a"

RPROVIDES:${PN} += "config-vnstat-cgi \
vnstat-cgi"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
libsqlite3.so.0 \
vnstat"

inherit rpm
