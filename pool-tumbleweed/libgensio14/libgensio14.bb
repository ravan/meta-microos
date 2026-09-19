SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types. You \
create a gensio object (or a gensio), and you can use that gensio \
without having to know too much about what is going on underneath. \
You can stack gensio on top of another one to add protocol \
funcionality. For instance, you can create a TCP gensio, stack SSL \
on top of that, and stack Telnet on top of that. It supports a \
number of network I/O and serial ports. gensios that stack on \
other gensios are called filters."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "libgensio14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "517a0ade848f3680b49983ae5523535c53b56e72211d52f01ea3636934db957a42497492e7687318f3bb9aa0f99e4bd47b06e62f40afd5834265113badcadb2d"

RPROVIDES:${PN} += "libgensio-ax25.so \
libgensio-axfec.so \
libgensio-certauth.so \
libgensio-chardelay.so \
libgensio-conacc.so \
libgensio-convcode.so \
libgensio-dgram.so \
libgensio-dummy.so \
libgensio-echo.so \
libgensio-file.so \
libgensio-fsk.so \
libgensio-hdlc.so \
libgensio-ipmisol.so \
libgensio-keepopen.so \
libgensio-kiss.so \
libgensio-mdns.so \
libgensio-msgdelim.so \
libgensio-mux.so \
libgensio-net.so \
libgensio-perf.so \
libgensio-pty.so \
libgensio-ratelimit.so \
libgensio-relpkt.so \
libgensio-script.so \
libgensio-sctp.so \
libgensio-serialdev.so \
libgensio-sound.so \
libgensio-ssl.so \
libgensio-stdio.so \
libgensio-telnet.so \
libgensio-trace.so \
libgensio-xlt.so \
libgensio.so.14 \
libgensio14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libc.so.6 \
libcrypto.so.3 \
libgensio-openipmi-oshandler.so.14 \
libgensiomdns.so.14 \
libgensioosh.so.14 \
libm.so.6 \
libssl.so.3"

inherit rpm
