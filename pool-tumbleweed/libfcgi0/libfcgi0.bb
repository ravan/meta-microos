SUMMARY = "A scalable, open extension to CGI - System library"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.7"

RPM_NAME = "libfcgi0-2.4.7-1.7.aarch64.rpm"
RPM_HASH = "152e44c65b628489ccfcc347c49bb315dfce303d132790a715394dbb2b19a26a3649232208b5c96aad7b60541e6e33f59b4ff352a7010ef8fad5a66a2d48550d"

RPROVIDES:${PN} += "libfcgi++-0 \
libfcgi++.so.0 \
libfcgi.so.0 \
libfcgi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
