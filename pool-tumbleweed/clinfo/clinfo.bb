SUMMARY = "Utility that reports status information for all installed OpenCL ICDs"
DESCRIPTION = "A simple OpenCL application that enumerates all possible platform and \
device properties. Inspired by AMD's program of the same name, it is \
coded in pure C99 and it tries to output all possible information, \
including that provided by platform-specific extensions, and not to \
crash on platform-unsupported properties (e.g. 1.2 properties on 1.1 \
platforms)."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.25.02.14"

RPM_NAME = "clinfo-3.0.25.02.14-1.5.aarch64.rpm"
RPM_HASH = "a694ef6fb96c8fefeb7e8a27686845c30ae88fb71aa2bb704fdac20f52c63a77e144e00cf3432223d66dd3fe533d8157a8ece60e823b553c08c46ff3fc0cd3b1"

RPROVIDES:${PN} += "clinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6"

inherit rpm
