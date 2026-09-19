SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mlag_pb implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libmlag_pb0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "1a85c879098f6e199915a0d00516db016d5f34ac14656fd5da6fef1849d2641d0498a22e69862687f34b58d7bbdbaa1f863b14590ab3f39e0fbf3092dfb76641"

RPROVIDES:${PN} += "libmlag-pb.so.0 \
libmlag-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
