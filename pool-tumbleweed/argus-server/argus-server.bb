SUMMARY = "Daemon for Network Monitoring Tool"
DESCRIPTION = "Daemon for Argus network monitoring tool."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-server-3.0.8.3-4.10.aarch64.rpm"
RPM_HASH = "4b61132a21da430adc25ee3793cb9c386e7ae4b2268bb62653fcaec116bc5415fa073f267a3f61b86d8d33aa30f5c2a06429f85f71cb844b004efff10cdf12e6"

RPROVIDES:${PN} += "argus-/usr/sbin/argus \
argus-server \
config-argus-server"

RDEPENDS:${PN} += "/usr/bin/sh \
argus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1 \
libwrap.so.0"

inherit rpm
