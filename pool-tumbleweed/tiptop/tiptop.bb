SUMMARY = "Performance monitoring tool using hardware counters"
DESCRIPTION = "Tiptop is a performance monitoring tool for Linux. It provides a dynamic \
real-time view of the tasks running in the system. Tiptop is very similar \
to the top utility, but most of the information displayed comes from \
hardware counters."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "tiptop-2.3.1-4.10.aarch64.rpm"
RPM_HASH = "4a4e11a010306fb6786df8c82b48277594b64fab4ae57669ff80722a41819a0c6da7a3a54b8c531c2e515d961fc6f7472462fc2abfdd4f2f4ccd20e4d172d528"

RPROVIDES:${PN} += "tiptop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libxml2.so.16"

inherit rpm
