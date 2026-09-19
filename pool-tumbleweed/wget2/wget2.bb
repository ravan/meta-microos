SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
In many cases Wget2 downloads much faster than Wget1.x due to HTTP \
zlib compression, parallel connections and use of If-Modified-Since \
HTTP header. HTTP/2 has been implemented. Wget2 also consumes less \
system and user CPU cycles than Wget1.x."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "wget2-2.2.1-1.5.aarch64.rpm"
RPM_HASH = "73f85327b0f868a25f98f26c162fef7b45e5d4aa428be683a87af0c5101294ed04311f783f23d8c889b3ea5f66180da60593b89e67dde21ef6d5b99ae61fdd01"

RPROVIDES:${PN} += "wget2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libwget.so.4"

inherit rpm
