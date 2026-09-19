SUMMARY = "Compute Voronoi diagrams from sets of points"
DESCRIPTION = "This module computes Voronoi diagrams from a set of input points. Info on \
Voronoi diagrams can be found here: \
 \
  http://en.wikipedia.org/wiki/Voronoi_diagram \
 \
This module is a wrapper around a C implementation found here: \
 \
  http://www.derekbradley.ca/voronoi.html \
 \
Which is itself a modification of code by Steve Fortune, the inventor of \
the algorithm used (Fortune's algorithm): \
 \
  http://cm.bell-labs.com/who/sjf/ \
 \
I made changes to the C code to allow reading input and writing output \
to/from Perl data-structures. I also modified the memory allocation code to \
use Perl's memory allocator. Finally, I changed all floats to doubles to \
provide better precision and to match Perl's NVs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.300.0"

RPM_NAME = "perl-Math-Geometry-Voronoi-1.300.0-1.11.aarch64.rpm"
RPM_HASH = "e6e198082de0c3108f6969f9bcfebe6c92c5a02621b9141fc7705e8d0ef2e9fac9e96529a6f2f7840d13cbc59d5ec681fe52fe104b15c889755f8552be7ea9c0"

RPROVIDES:${PN} += "perl-Math--Geometry--Voronoi \
perl-Math-Geometry-Voronoi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Params--Validate"

inherit rpm
