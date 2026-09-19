SUMMARY = "Isolated String helpers from B"
DESCRIPTION = "XString provides the B string helpers in one isolated package. Right now \
only cstring and perlstring are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-XString-0.005-1.34.aarch64.rpm"
RPM_HASH = "6a24366d883859cf35b7216bfa4cf0c2fc06c24928a7ee672d8b01bffa60c7a192954a5cb85338b011b29fde24679aee3cd2b2576e88c8df85d1299bc120d0b2"

RPROVIDES:${PN} += "perl-XString"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
