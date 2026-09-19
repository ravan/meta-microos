SUMMARY = "Accelerator for HTTP services"
DESCRIPTION = "Vinyl Cache is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is \
either given the cached document, or a 'fresh' document requested \
from a backend server. The purpose of this is to minimize the \
requests going to the backend server(s) by serving the same document \
to potentially many users."
LICENSE = "BSD-2-Clause"

PV = "9.0.1"

RPM_NAME = "vinyl-cache-9.0.1-3.1.aarch64.rpm"
RPM_HASH = "9fb42cbbc687b4a06bcfb855bc3e881cddc211ed72a98728ab2c9b552437a48619b1c73ac620b911565563418a90371f0474c118e69c2568a7ea55389ba8cf59"

RPROVIDES:${PN} += "config-vinyl-cache \
group-vinyl-cache \
libvmod-blob.so \
libvmod-cookie.so \
libvmod-directors.so \
libvmod-h2.so \
libvmod-math.so \
libvmod-proxy.so \
libvmod-purge.so \
libvmod-std.so \
libvmod-unix.so \
libvmod-vtc.so \
user-vinyl-cache \
vinyl-cache"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
c-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
libtinfo.so.6 \
libvinylapi.so.3 \
sysuser-shadow"

inherit rpm
