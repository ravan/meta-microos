SUMMARY = "Checks if the documentation of a module is comprehensive"
DESCRIPTION = "Developers hate writing documentation. They'd hate it even more if their \
computer tattled on them, but maybe they'll be even more thankful in the \
long run. Even if not, _perlmodstyle_ tells you to, so you must obey. \
 \
This module provides a mechanism for determining if the pod for a given \
module is comprehensive. \
 \
It expects to find either a '=head(n>1)' or an '=item' block documenting a \
subroutine. \
 \
Consider: # an imaginary Foo.pm package Foo; \
 \
 =item foo \
 \
 The foo sub \
 \
 = cut \
 \
 sub foo {} \
 sub bar {} \
 \
 1; \
 __END__ \
 \
In this example 'Foo::foo' is covered, but 'Foo::bar' is not, so the 'Foo' \
package is only 50% (0.5) covered"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.230.0"

RPM_NAME = "perl-Pod-Coverage-0.230.0-1.3.noarch.rpm"
RPM_HASH = "d693e1f66ecd609d678b301f07853b601857687edaa6731ce47dfc42f3369be1695be489e8a72289805d8fd8c2ea49e3b26a007dc4615e4f56c82d634c4f7f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage \
perl-Pod--Coverage--CountParents \
perl-Pod--Coverage--ExportOnly \
perl-Pod--Coverage--Extractor \
perl-Pod--Coverage--Overloader \
perl-Pod-Coverage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Symdump \
perl-Pod--Find \
perl-Pod--Parser"

inherit rpm
