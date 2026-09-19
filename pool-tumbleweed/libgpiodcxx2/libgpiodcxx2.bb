SUMMARY = "C++library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C++ library part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiodcxx2-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "7e5258953cdfdef935001133df11a2416a6d62155adc3f315e13814598fe19f579888e7b6275531d80d06a6aaf1aeba7d8d172917a59216292ae40bb8cc255af"

RPROVIDES:${PN} += "libgpiodcxx.so.2 \
libgpiodcxx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpiod.so.3 \
libstdc++.so.6"

inherit rpm
