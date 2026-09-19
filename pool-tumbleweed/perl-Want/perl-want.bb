SUMMARY = "Generalisation of C<Wantarray>"
DESCRIPTION = "This module generalises the mechanism of the *wantarray* function, allowing \
a function to determine in some detail how its return value is going to be \
immediately used."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.29"

RPM_NAME = "perl-Want-0.29-1.53.aarch64.rpm"
RPM_HASH = "dada95afe72cc6d2a9edd8c168af59a3497f1cfbb7d4781eea21f44b4c0c20c9a7aa7f1f2c4a0f13f5d00113a582e552252daf53121230ce4a22d34493db749f"

RPROVIDES:${PN} += "perl-Want"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
