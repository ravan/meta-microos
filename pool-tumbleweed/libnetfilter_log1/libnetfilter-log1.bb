SUMMARY = "Userspace library for accessing logged packets"
DESCRIPTION = "libnetfilter_log is a userspace library providing interface to \
packets that have been logged by the kernel packet filter. It is is \
part of a system that deprecates the old syslog/dmesg based packet \
logging. This library has been previously known as libnfnetlink_log."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnetfilter_log1-1.0.2-1.16.aarch64.rpm"
RPM_HASH = "af8d5864bcf06297b45e17eddf14e0f17d600cef15c4e8d19caee729373a782cefc676e5b26a2140c5f832db32a127b095157fd1dfc2303e4b52b16360e3afd2"

RPROVIDES:${PN} += "libnetfilter-log-libipulog.so.1 \
libnetfilter-log.so.1 \
libnetfilter-log1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnfnetlink.so.0"

inherit rpm
