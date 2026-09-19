SUMMARY = "A Secure, Fast, Compliant, and Very Flexible Web Server"
DESCRIPTION = "Lighttpd is a secure, fast, compliant, and very flexible Web server \
that has been optimized for high-performance environments. It has a \
very low memory footprint compared to other Web servers and takes care \
of CPU load. Its advanced feature set (FastCGI, CGI, Auth, \
Output-Compression, URL-Rewriting, and more) makes lighttpd the perfect \
Web server software for every server that is suffering load problems."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "6021a5daf3b0c1db2d3920eb0c2c44381651fc686e5afc5f22914717558016095e98f634447a36cd6cc234d28b55172a2ca2afab7550298f88942335e3b61a7d"

RPROVIDES:${PN} += "config-lighttpd \
group-lighttpd \
http-daemon \
httpd \
lighttpd \
user-lighttpd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libnettle.so.8 \
libpcre2-8.so.0 \
shadow \
spawn-fcgi \
systemd"

inherit rpm
