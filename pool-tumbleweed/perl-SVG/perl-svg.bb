SUMMARY = "Perl extension for generating Scalable Vector Graphics (SVG) documents"
DESCRIPTION = "SVG is a 100% Perl module which generates a nested data structure \
containing the DOM representation of an SVG (Scalable Vector Graphics) \
image. Using SVG, you can generate SVG objects, embed other SVG instances \
into it, access the DOM object, create and access javascript, and generate \
SMIL animation content."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.890.0"

RPM_NAME = "perl-SVG-2.890.0-1.4.noarch.rpm"
RPM_HASH = "2a72b856228d6ac7797e534095eb5b40afe9061b9b8833b6d424b0bc5aa864e447ace5498fe867095c8ba15108b31624fa7e98c4cfc06fddbc2d336a92be0164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SVG \
perl-SVG--DOM \
perl-SVG--Element \
perl-SVG--Extension \
perl-SVG--XML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
