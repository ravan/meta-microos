SUMMARY = "Create and manipulate PAR distributions"
DESCRIPTION = "This module creates and manipulates _PAR distributions_. They are \
architecture-specific *PAR* files, containing everything under _blib/_ of \
CPAN distributions after their 'make' or 'Build' stage, a _META.yml_ \
describing metadata of the original CPAN distribution, and a _MANIFEST_ \
detailing all files within it. Digitally signed PAR distributions will also \
contain a _SIGNATURE_ file. \
 \
The naming convention for such distributions is: \
 \
    $NAME-$VERSION-$ARCH-$PERL_VERSION.par \
 \
For example, 'PAR-Dist-0.01-i386-freebsd-5.8.0.par' corresponds to the 0.01 \
release of 'PAR-Dist' on CPAN, built for perl 5.8.0 running on \
'i386-freebsd'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.530.0"

RPM_NAME = "perl-PAR-Dist-0.530.0-1.12.noarch.rpm"
RPM_HASH = "7034910b85953085171de10a5a557aedc95a763820e60852c0835130219077a043f778c1c5ac855f082bd54b79597291a8aafd08ec361f8cf385fc5a160e137d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PAR--Dist \
perl-PAR-Dist"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
