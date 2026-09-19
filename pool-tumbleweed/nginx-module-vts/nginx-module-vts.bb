SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "nginx-module-vts-0.2.7-1.3.aarch64.rpm"
RPM_HASH = "81127563c7b18a0e84e4d156799a0fcb2ee97e0c343fdc9e41461e3c89fa786bc9fae0f679791d44c48da48235ea099b5b3d6f72dbaf6ece36986f6e059b3271"

RPROVIDES:${PN} += "nginx-module-vts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
