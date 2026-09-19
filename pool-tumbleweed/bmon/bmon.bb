SUMMARY = "Bandwidth Monitor and Rate Estimator"
DESCRIPTION = "bmon is a portable bandwidth monitor and rate estimator. It supports various \
input methods for different architectures. Various output modes exist, \
including an interactive curses interface, lightweight HTML output, and simple \
ASCII output. Statistics may be distributed over a network using multicast or \
unicast and collected at some point to generate a summary of statistics for a \
set of nodes."
LICENSE = "MIT | BSD-2-Clause"

PV = "4.0"

RPM_NAME = "bmon-4.0-1.38.aarch64.rpm"
RPM_HASH = "de082c06247b2162970c0878b560a56e5de6e0541e2b853487cc8ffbdc1a7611886c3f3972b62572852466cecaeeb5d2a1d75fce4a5e273930bc8326a9e6fd95"

RPROVIDES:${PN} += "bmon \
config-bmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libtinfo.so.6"

inherit rpm
