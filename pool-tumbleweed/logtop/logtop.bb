SUMMARY = "Statistics generator for logs"
DESCRIPTION = "Logtop is a basic log analyzer. \
It allows piping logs into it to obtain statistics."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "logtop-0.7-1.27.aarch64.rpm"
RPM_HASH = "e6aa8fc29ab9121ba6498ca647a1fb8f675001ffcc425f14bd470cae82bf334bff93a6a13127e64e908282cd6daf75fed412a93df7a1648208232d42e6633dcf"

RPROVIDES:${PN} += "logtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6"

inherit rpm
