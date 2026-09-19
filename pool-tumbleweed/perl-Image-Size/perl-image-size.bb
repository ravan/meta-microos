SUMMARY = "Read the dimensions of an image in several popular formats"
DESCRIPTION = "The *Image::Size* library is based upon the 'wwwis' script written by Alex \
Knowles _(alex@ed.ac.uk)_, a tool to examine HTML and add 'width' and \
'height' parameters to image tags. The sizes are cached internally based on \
file name, so multiple calls on the same file name (such as images used in \
bulleted lists, for example) do not result in repeated computations."
LICENSE = "LGPL-2.1-only | Artistic-1.0"

PV = "3.300"

RPM_NAME = "perl-Image-Size-3.300-3.26.noarch.rpm"
RPM_HASH = "e07050e90745070db95325674724e1f88d1d2b86fc475b005fe7aa73e610c527bb4b594a35ca26e63c4729b2ca7bb6985ef55f79d4c2487ceb1657858c23003d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Image--Size \
perl-Image-Size"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--Build \
perl-Test--More"

inherit rpm
