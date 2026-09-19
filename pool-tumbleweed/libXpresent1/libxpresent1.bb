SUMMARY = "An X Window System client interface to the Present extension to the X protocol"
DESCRIPTION = "libXpresent provides an X Window System client interface to the \
Present extension to the X protocol. \
 \
The Present extension provides a way for applications to update their \
window contents from a pixmap in a well defined fashion, \
synchronizing with the display refresh and potentially using a more \
efficient mechanism than copying the contents of the source pixmap."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libXpresent1-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "3307f8620ba627b2eb27512aa189e111539059f0dab6c4160b63e520451ffcec3dd8d830e2b8e2fc5242bc7f70af360013c96be678845441f36a0c1dd3196f49"

RPROVIDES:${PN} += "libXpresent.so.1 \
libXpresent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
