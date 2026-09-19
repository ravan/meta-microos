SUMMARY = "Disables Multidimensional Array Emulation"
DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the '$' sigil instead of '@'. \
 \
This module lexically makes using multidimensional array emulation a fatal \
error at compile time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-multidimensional-0.014-1.45.aarch64.rpm"
RPM_HASH = "1b1c8936537731d0ff8aa585089500a9e097f2791763c24d170d890c787a7899ef5caf75d47a25f6319a1ccd72b11551bec8c1652e4a8a14c79bee7c454e8bf9"

RPROVIDES:${PN} += "perl-multidimensional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Hooks--OP--Check"

inherit rpm
