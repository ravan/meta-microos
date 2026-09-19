SUMMARY = "A HTTP server and IMAP/POP3 proxy server"
DESCRIPTION = "nginx [engine x] is a HTTP server and IMAP/POP3 proxy server written by Igor Sysoev. \
It has been running on many heavily loaded Russian sites for more than two years."
LICENSE = "BSD-2-Clause"

PV = "1.31.5"

RPM_NAME = "nginx-1.31.5-1.1.aarch64.rpm"
RPM_HASH = "13040cb18fe5fc20e76dc853e6cb12b28256bc627967404cbd83b4878da103240a0ff0131abb6d43040e1e54b9f10332556df9103ca101fbb2ed654ded926ca4"

RPROVIDES:${PN} += "config-nginx \
group-nginx \
http-daemon \
httpd \
nginx \
perl-nginx \
user-nginx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexslt.so.0 \
libgd.so.3 \
libpcre2-8.so.0 \
libperl.so \
libssl.so.3 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
perl \
sysuser-shadow"

inherit rpm
