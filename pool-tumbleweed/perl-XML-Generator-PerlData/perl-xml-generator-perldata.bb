SUMMARY = "Perl extension for generating SAX2 events from nested Perl data structures"
DESCRIPTION = "XML::Generator::PerlData provides a simple way to generate SAX2 events from \
nested Perl data structures, while providing finer-grained control over the \
resulting document streams. \
 \
Processing comes in two flavors: *Simple Style* and *Stream Style*: \
 \
In a nutshell, 'simple style' is best used for those cases where you have a \
a single Perl data structure that you want to convert to XML as quickly and \
painlessly as possible. 'Stream style' is more useful for cases where you \
are receiving chunks of data (like from a DBI handle) and you want to \
process those chunks as they appear. See *PROCESSING METHODS* for more info \
about how each style works."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.95"

RPM_NAME = "perl-XML-Generator-PerlData-0.95-1.41.noarch.rpm"
RPM_HASH = "3bcc3dd490d2123fda5b4fc335fbe465c887dc31e1713101ab0b18544bf32178211a5cea26c7b57453f3eccf8f1b47c0ba737b07e13bac800248665fd32a67c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Generator--PerlData \
perl-XML-Generator-PerlData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--SAX--Base"

inherit rpm
