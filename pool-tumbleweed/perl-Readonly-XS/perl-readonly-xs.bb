SUMMARY = "Companion module for Readonly.pm, to speed up read-only scalar variables"
DESCRIPTION = "This is a companion module to Readonly.pm.  You do not use \
Readonly::XS directly.  Instead, once it is installed, Readonly.pm \
will detect this and will use it for creating read-only scalars.  This \
results in a significant speed improvement.  This does not speed up \
read-only arrays or hashes. \
 \
Authors: \
-------- \
    Eric Roode, <roode@cpan.org>"
LICENSE = "GPL-2.0+"

PV = "1.05"

RPM_NAME = "perl-Readonly-XS-1.05-23.56.aarch64.rpm"
RPM_HASH = "6baca090ee33a42e29e7166ea1be9e11850435431e18d63f4f21fd08021c6ceed83e5a8bdddec32fa0083bb48ada81af1ce37cdce81be6743cd15f260a82f90d"

RPROVIDES:${PN} += "Readonly-XS \
perl-Readonly--XS \
perl-Readonly-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Readonly"

inherit rpm
