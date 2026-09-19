SUMMARY = "Perl extension for the SANE (Scanner Access Now Easy)"
DESCRIPTION = "These Perl bindings for the SANE (Scanner Access Now Easy) Project allow \
you to access SANE-compatible scanners in a Perlish and object-oriented \
way, freeing you from the casting and memory management in C, yet remaining \
very close in spirit to original API. \
 \
Find out more about SANE at http://www.sane-project.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5"

RPM_NAME = "perl-Image-Sane-5-4.13.aarch64.rpm"
RPM_HASH = "62160499515468761eb7a0d8052b2115d12ad23de92886f52e022c8d1aacb9b5d5f3c6c501fbbb609dbbee5cdd5621eac3791e0c4c9526367680b462538ec4b9"

RPROVIDES:${PN} += "perl-Image--Sane \
perl-Image--Sane--Device \
perl-Image-Sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
perl--MODULE-COMPAT-5.44.0 \
perl-Exception--Class \
perl-Readonly"

inherit rpm
