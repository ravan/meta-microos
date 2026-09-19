SUMMARY = "Backend library for Math::BigInt etc. based on GMP"
DESCRIPTION = "Math::BigInt::GMP is a replacement library for Math::BigInt::Calc that \
reimplements some of the Math::BigInt::Calc functions in XS. It can be used \
via: \
 \
    use Math::BigInt lib => 'GMP'; \
 \
This package contains a replacement (drop-in) module for Math::BigInt's core, \
Math::BigInt::Calc.pm."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.7003"

RPM_NAME = "perl-Math-BigInt-GMP-1.7003-1.8.aarch64.rpm"
RPM_HASH = "59254ed09c90691181713d863fb6cd5ffe5df06f9150214ccde0f9da2e30628bc14ddd9522c5e252e6e182bd9a162a87a998f4076d092077bcfb022579a531d4"

RPROVIDES:${PN} += "perl-Math--BigInt--GMP \
perl-Math-BigInt-GMP"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Math--BigInt"

inherit rpm
