SUMMARY = "A C library for parsing command line parameters"
DESCRIPTION = "Popt is a C library for parsing command line parameters.  Popt was \
heavily influenced by the getopt() and getopt_long() functions. It \
improves on them by allowing more powerful argument expansion. Popt can \
parse arbitrary argv[] style arrays and automatically set variables \
based on command line arguments.  Popt allows command line arguments to \
be aliased via configuration files and includes utility functions for \
parsing arbitrary strings into argv[] arrays using shell-like rules."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "libpopt0-1.19-2.3.aarch64.rpm"
RPM_HASH = "7f6924a2740552329d82dda7be3f05ec65a9578f2061769ec5028e05cdd1d257fc5254e0cb6f4eb645de9746dfbce8f97c1b67ceed9919fadba9caf8c4227b5a"

RPROVIDES:${PN} += "libpopt.so.0 \
libpopt0 \
popt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
