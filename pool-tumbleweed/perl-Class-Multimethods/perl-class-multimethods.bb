SUMMARY = "Support multimethods and function overloading in Perl"
DESCRIPTION = "The Class:Multimethod module exports a subroutine (&multimethod) that can \
be used to declare other subroutines that are dispatched using a algorithm \
different from the normal Perl subroutine or method dispatch mechanism."
LICENSE = "Artistic-1.0"

PV = "1.701"

RPM_NAME = "perl-Class-Multimethods-1.701-1.36.noarch.rpm"
RPM_HASH = "25ec0e4ad527f45a5d529ed17580a298b51f2af3ad63f3f99a16046c82ce4c4859b3da3377c289a53cbb76a05497254146fe2d48d0907462682f7b96bb5a2f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Multimethods \
perl-Class-Multimethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
