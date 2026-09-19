SUMMARY = "Calculate convex hulls using Graham's scan (n*log(n))"
DESCRIPTION = "'Math::ConvexHull' is a simple module that calculates convex hulls from a \
set of points in 2D space. It is a straightforward implementation of the \
algorithm known as Graham's scan which, with complexity of O(n*log(n)), is \
the fastest known method of finding the convex hull of an arbitrary set of \
points. There are some methods of eliminating points that cannot be part of \
the convex hull. These may or may not be implemented in a future version. \
 \
The implementation cannot deal with duplicate points. Therefore, points \
which are very, very close (think floating point close) to the previous \
point are dropped since version 1.02 of the module. However, if you pass in \
randomly ordered data which contains duplicate points, this safety measure \
might not help you. In that case, you will have to remove duplicates \
yourself."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-Math-ConvexHull-1.04-3.42.noarch.rpm"
RPM_HASH = "ab633822d67a8f933de67c919936bd0f9cd84155d9a684d8f59bf97921fe07a1ca9e61d3569e22a913e0403968e5fd6a58cf0d28ec31bbd858e8597d2eda483d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--ConvexHull \
perl-Math-ConvexHull"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
