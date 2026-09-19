SUMMARY = "When you need a web server in a hurry"
DESCRIPTION = "Features: \
    Simple to set up: \
        Single binary, no other files, no installation needed. \
        Standalone, doesn't need inetd or ucspi-tcp. \
        No messing around with config files - all you have to specify is the www root. \
    Written in C - efficient and portable. \
    Small memory footprint. \
    Event loop, single threaded - no fork() or pthreads. \
    Generates directory listings. \
    Supports HTTP GET and HEAD requests. \
    Supports Range / partial content. (try streaming music files or resuming a download) \
    Supports If-Modified-Since. \
    Supports Keep-Alive connections. \
    Supports IPv6. \
    Can serve 301 redirects based on Host header. \
    Uses sendfile() on FreeBSD, Solaris and Linux. \
    Can use acceptfilter on FreeBSD. \
    At some point worked on FreeBSD, Linux, OpenBSD, Solaris. \
    ISC license. \
    suckless.org says darkhttpd sucks less. \
    Small Docker image (<100KB) \
 \
Security: \
    Can log accesses, including Referer and User-Agent. \
    Can chroot. \
    Can drop privileges. \
    Impervious to /../ sniffing. \
    Times out idle connections. \
    Drops overly long requests. \
 \
Limitations: \
    Only serves static content - no CGI."
LICENSE = "ISC"

PV = "1.17"

RPM_NAME = "darkhttpd-1.17-1.5.aarch64.rpm"
RPM_HASH = "473611dd2db60b5de8e4c6527d5c55c8e8c100b3fb1b89bf13ff9b7465d81ee7ec40588f1a0b796f1513d00ec7c966507e5833947d455662876af13749561f6b"

RPROVIDES:${PN} += "darkhttpd \
group-darkhttpd \
http-daemon \
httpd \
user-darkhttpd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
sysuser-shadow"

inherit rpm
