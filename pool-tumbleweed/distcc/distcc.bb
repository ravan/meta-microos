SUMMARY = "A distributed C/C++ compiler"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-3.4-6.7.aarch64.rpm"
RPM_HASH = "22e3d81feb4ea9c1c160e66d0def8caccdaf0169ed333b6ada439e794708419be3c7ccb879c77f11799cb9bbb70bc42b20de20d7cf849355f31cb58d0090548e"

RPROVIDES:${PN} += "config-distcc \
distcc"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
