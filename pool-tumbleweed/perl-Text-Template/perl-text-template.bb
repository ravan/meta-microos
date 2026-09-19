SUMMARY = "Expand template text with embedded Perl"
DESCRIPTION = "This is a library for generating form letters, building HTML pages, or \
filling in templates generally. A `template' is a piece of text that has \
little Perl programs embedded in it here and there. When you `fill in' a \
template, you evaluate the little programs and replace them with their \
values. \
 \
You can store a template in a file outside your program. People can modify \
the template without modifying the program. You can separate the formatting \
details from the main code, and put the formatting parts of the program \
into the template. That prevents code bloat and encourages functional \
separation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-Text-Template-1.61-1.22.noarch.rpm"
RPM_HASH = "09eedf91e7736d88e213868f4e49ede4b8ecfef0d1fc30e00eee34dba1fd6809dce3b4dd44cbb658f418dec5358ab2ce103066b2cbdf2bf0b67452002d8d1b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Template \
perl-Text--Template--Preprocess \
perl-Text-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
