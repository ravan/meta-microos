SUMMARY = "Read a file backwards by lines"
DESCRIPTION = "This module reads a file backwards line by line. It is simple to use, \
memory efficient and fast. It supports both an object and a tied handle \
interface. \
 \
It is intended for processing log and other similar text files which \
typically have their newest entries appended to them. By default files are \
assumed to be plain text and have a line ending appropriate to the OS. But \
you can set the input record separator string on a per file basis."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-File-ReadBackwards-1.06-1.25.noarch.rpm"
RPM_HASH = "343d3a9657cc4b53c3fd753fe96b254bcc20900e96d02aaa9ce36f3d700e45201db157237c4afe37bc086477ebc38aa69cefdc6c8511d431a35a7a79af94bb74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ReadBackwards \
perl-File-ReadBackwards"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
