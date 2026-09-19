SUMMARY = "A collection of special mathematical functions"
DESCRIPTION = "Openspecfun provides AMOS and Faddeeva. AMOS (from Netlib) is a portable package \
for Bessel Functions of a Complex Argument and Nonnegative Order; it contains \
subroutines for computing Bessel functions and Airy functions. Faddeeva allows \
computing the various error functions of arbitrary complex arguments (Faddeeva \
function, error function, complementary error function, scaled complementary \
error function, imaginary error function, and Dawson function); given these, \
one can also easily compute Voigt functions, Fresnel integrals, and similar \
related functions as well."
LICENSE = "MIT"

PV = "0.5.6"

RPM_NAME = "libopenspecfun2-0.5.6-1.9.aarch64.rpm"
RPM_HASH = "1555537fa58817b066ca758c396aaa55122c18a19959dc7d7a25e57cb0d102d8f25dc08b23b8aa2b3023b80592c96a9a4fb43bb4d8f441e7183e5dd7a3a74313"

RPROVIDES:${PN} += "libopenspecfun.so.2 \
libopenspecfun2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
