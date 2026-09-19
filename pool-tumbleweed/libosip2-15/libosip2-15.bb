SUMMARY = "Implementation of SIP (RFC 3261)"
DESCRIPTION = "This is the GNU oSIP library. It has been designed to provide the \
Internet community with a simple way to support the Session Initiation \
Protocol. SIP is described in the RFC 3261, which is available at \
http://www.ietf.org/rfc/rfc3261.txt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "libosip2-15-5.3.1-1.12.aarch64.rpm"
RPM_HASH = "e1e029acd5187b2bc7cd58ab645ff2d49dfe4b249cb393066af1ac25d7327237ca45d50d7830772d1ee828a148663727c256cadf81be063bce581133d8efb2c5"

RPROVIDES:${PN} += "libosip2-15 \
libosip2.so.15 \
libosipparser2.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
