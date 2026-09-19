SUMMARY = "Userspace library for accessing logged packets"
DESCRIPTION = "libnetfilter_log is a userspace library providing interface to \
packets that have been logged by the kernel packet filter. It is is \
part of a system that deprecates the old syslog/dmesg based packet \
logging. This library has been previously known as libnfnetlink_log."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnetfilter_log-devel-1.0.2-1.16.aarch64.rpm"
RPM_HASH = "1ead0db112e895dde94587fafe0240e4386a051448544b548e67e4b10a704171e06b2bc96e54b2050a92300ca450b891e2c65360777d6b85f700f140409b738f"

RPROVIDES:${PN} += "libnetfilter-log-devel \
pkgconfig-libnetfilter-log \
pkgconfig-libnetfilter-log-libipulog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-log1 \
libnfnetlink-devel \
pkgconfig-libmnl \
pkgconfig-libnetfilter-log \
pkgconfig-libnfnetlink"

inherit rpm
