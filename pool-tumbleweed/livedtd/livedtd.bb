SUMMARY = "DTD Visualizing Tool"
DESCRIPTION = "The package comes with a Perl script (livedtd.pl) that converts an SGML \
or XML DTD (Document Type Definition) into an HTML document.  The HTML \
document is exactly the same text as the DTD but with 'live' links that \
let you navigate through the DTD. \
 \
 \
 \
Authors: \
-------- \
    Robert Stayton <bobs@sagehill.net>"
LICENSE = "BSD-3-Clause"

PV = "2007.1.15"

RPM_NAME = "livedtd-2007.1.15-24.6.noarch.rpm"
RPM_HASH = "1d790297709dc590b1dc9adea421dd77982a8f70dd65bb22b9f21e29642485e61a2a373510088b0c6265d774b276b5d1ad32b330e9640e7f6f2749c62d9fe527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "livedtd \
perl-OASIS--Catalog"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
