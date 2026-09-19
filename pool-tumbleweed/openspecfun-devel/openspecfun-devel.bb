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

RPM_NAME = "openspecfun-devel-0.5.6-1.9.aarch64.rpm"
RPM_HASH = "7282a23b9b35ee64e20692d859e6539ab4ed5324e3486a8d0f33e2d345000fd94184b6ede32ad429182116a22d82fbf8b3697cecb9f99ffd75e201ff42c893dc"

RPROVIDES:${PN} += "openspecfun-devel"

RDEPENDS:${PN} += "libopenspecfun2"

inherit rpm
