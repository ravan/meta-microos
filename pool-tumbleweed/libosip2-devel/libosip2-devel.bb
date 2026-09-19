SUMMARY = "Header files for the GNU SIP implementation"
DESCRIPTION = "This is the GNU oSIP library. It has been designed to provide the \
Internet community with a simple way to support the Session Initiation \
Protocol. SIP is described in the RFC 3261, which is available at \
http://www.ietf.org/rfc/rfc3261.txt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "libosip2-devel-5.3.1-1.12.aarch64.rpm"
RPM_HASH = "9915047c1d8a530a610d69dfef840d102c3b3a59c5b2d4312a21ca94812bf826d5b401369e2bf58821d6edfb9e3d6b886997d66829c0f7ec0a1dddc0967bb8b1"

RPROVIDES:${PN} += "libosip2-/usr/include/osip2/osip.h \
libosip2-devel \
pkgconfig-libosip2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libosip2-15"

inherit rpm
