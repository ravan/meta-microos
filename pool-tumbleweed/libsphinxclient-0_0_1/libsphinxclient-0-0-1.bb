SUMMARY = "Pure C searchd client API library"
DESCRIPTION = "Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-0_0_1-2.2.11-10.10.aarch64.rpm"
RPM_HASH = "86a3a381d712dbcae1420ccd0e53ed751fd84652c9c9e61e74637253c61b2f0f9898780e2aedfaf5725bb807b146e123f0d519b9f7385583d30f3043401afeb9"

RPROVIDES:${PN} += "libsphinxclient-0-0-1 \
libsphinxclient-0.0.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
