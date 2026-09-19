SUMMARY = "Minimalist WWW proxy"
DESCRIPTION = "Tinyproxy is a light-weight HTTP/HTTPS proxy daemon for POSIX \
operating systems. Designed from the ground up to be fast and yet \
small, it is an ideal solution for use cases such as embedded \
deployments where a full featured HTTP proxy is required, but the \
system resources for a larger proxy are unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.3"

RPM_NAME = "tinyproxy-1.11.3-3.3.aarch64.rpm"
RPM_HASH = "75b0b37279fcd6c3322375d0bb83281589096a38efb6f91815cc904b984401307cb310ef13093f8f0b131436b98ad3ca0f9f54bd4f1ee576f826172e35c6c4fe"

RPROVIDES:${PN} += "config-tinyproxy \
group-tinyproxy \
tinyproxy \
user-tinyproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate \
sysuser-shadow"

inherit rpm
