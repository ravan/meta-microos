SUMMARY = "The Internet Junkbuster - HTTP Proxy Server"
DESCRIPTION = "The Internet Junkbuster - HTTP Proxy Server: A non-caching HTTP proxy \
server that runs between a web browser and a web server and filters \
contents as described in the configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "privoxy-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "b1ac37552fc1f28afc53a3a56ad7ca276988b2e3da133531cfb9f14433dc30b11aa2c0d0d6781a4cf28b821f00f36e2fcd153d510c9c8fac6212e5b11abe54bf"

RPROVIDES:${PN} += "config-privoxy \
group-privoxy \
privoxy \
user-privoxy"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssl.so.3 \
libz.so.1 \
logrotate"

inherit rpm
