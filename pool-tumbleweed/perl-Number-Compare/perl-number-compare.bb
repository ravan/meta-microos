SUMMARY = "Numeric comparisons"
DESCRIPTION = "Number::Compare compiles a simple comparison to an anonymous subroutine, \
which you can call with a value to be tested again. \
 \
Now this would be very pointless, if Number::Compare didn't understand \
magnitudes. \
 \
The target value may use magnitudes of kilobytes ('k', 'ki'), megabytes \
('m', 'mi'), or gigabytes ('g', 'gi'). Those suffixed with an 'i' use the \
appropriate 2**n version in accordance with the IEC standard: \
https://physics.nist.gov/cuu/Units/binary.html"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Number-Compare-0.03-11.22.noarch.rpm"
RPM_HASH = "bc6777fb90f8b967c82ffbcfbe0d0669b27c297ebb8389f1c858413fa0c5e9c99d3b82ce0e9fa5b6742eb7b0df1d170c8ff9b0f4d6572339d86ea2e0edf8ebc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Compare \
perl-Number-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
