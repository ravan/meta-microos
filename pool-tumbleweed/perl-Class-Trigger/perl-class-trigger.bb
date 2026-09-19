SUMMARY = "Mixin to add / call inheritable triggers"
DESCRIPTION = "Class::Trigger is a mixin class to add / call triggers (or hooks) that get \
called at some points you specify."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Class-Trigger-0.15-1.29.noarch.rpm"
RPM_HASH = "d29e09b92a49fb0d895209d7d641cf8e444995fcc91baa5030d13b4d53bce966d451d59fa2829af7cdf02d25e1c41b91ad7a86372a29a471eab617af208ce509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Trigger \
perl-Class-Trigger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
