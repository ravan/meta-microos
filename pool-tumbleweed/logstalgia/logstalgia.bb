SUMMARY = "A website access log visualization tool"
DESCRIPTION = "Logstalgia is a website traffic visualization that replays or streams \
Apache web-server access logs as a pong-like battle between the web \
server and an never ending torrent of requests. Requests appear as \
colored balls (the same color as the host) which travel across the \
screen to arrive at the requested location. Successful requests are \
hit by the paddle while unsuccessful ones (eg 404 - File Not Found) \
are missed and pass through."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "logstalgia-1.1.4-2.10.aarch64.rpm"
RPM_HASH = "fc87101617c7a6c4d32c3316bf3faf4d42033b581cb3cd886758597f42d6383e4760068dd19a19e3a76e38f7c6850a79b3bb8493a98df75fe6a38ebec4a72597"

RPROVIDES:${PN} += "logstalgia"

RDEPENDS:${PN} += "freefont \
ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
