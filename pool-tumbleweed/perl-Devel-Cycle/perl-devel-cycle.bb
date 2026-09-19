SUMMARY = "Find memory cycles in objects"
DESCRIPTION = "This is a simple developer's tool for finding circular references in \
objects and other types of references. Because of Perl's reference-count \
based memory management, circular references will cause memory leaks."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.120.0"

RPM_NAME = "perl-Devel-Cycle-1.120.0-1.7.noarch.rpm"
RPM_HASH = "8108399dcd056a8e66a9a49b97d68aa9e02bc8783ca7db40c1ca05c4368d48cb63dc547e5a998f3f72d1986de541da18fe0f6bc05140c0c5bba84dde053cb1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cycle \
perl-Devel-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
