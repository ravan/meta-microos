SUMMARY = "Andrew's monotone chain algorithm for finding a convex hull in 2D"
DESCRIPTION = "This is somewhat experimental still. \
 \
This (XS) module optionally exports a single function 'convex_hull' which \
calculates the convex hull of the input points and returns it. The \
algorithm is 'O(n log n)' due to having to sort the input list, but should \
be somewhat faster than a plain Graham's scan (also 'O(n log n)') in \
practice since it avoids polar coordinates."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-Math-ConvexHull-MonotoneChain-0.01-3.55.aarch64.rpm"
RPM_HASH = "5a89bc80d51d484c8b8511ec0dfa6152161b3a79710def4d4e0aad1aed12a99d022c2d96db45221e5faf8aab9fe240e3ef5dd9540bb60dd4e6a2d1f256c6b47c"

RPROVIDES:${PN} += "perl-Math--ConvexHull--MonotoneChain \
perl-Math-ConvexHull-MonotoneChain"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
