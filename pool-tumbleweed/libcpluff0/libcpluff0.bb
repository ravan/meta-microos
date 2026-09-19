SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "libcpluff0-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "87300eccf4f8b5aacfc38a3ebe6f6c3594e295300f731cc1df5edd40a1e64cf8df290936dc6e3478db03df3aa3f241dffafd387557d9ef7f84966fdf3510c33e"

RPROVIDES:${PN} += "libcpluff.so.0 \
libcpluff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
