SUMMARY = "Calculator for nonreplacement probabilities"
DESCRIPTION = "This program computes odd for drawing card sets (e.g. non-replacement \
probabilities) using the hypergeometric function. It can also be used to \
compute binomial coefficients and the gamma function."
LICENSE = "BSD-2-Clause"

PV = "2.7"

RPM_NAME = "deal-2.7-1.6.aarch64.rpm"
RPM_HASH = "43b9b24e23fb422ab38986a771bf24e59fdd24d7c2e77831ef0058cba93a7d9aa4267caf244fdf0ad605b8a8c9a51c3fd7aca37dab5874e6e94b6c97e398ca3b"

RPROVIDES:${PN} += "deal"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
