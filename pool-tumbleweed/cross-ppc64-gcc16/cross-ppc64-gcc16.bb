SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-ppc64-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "667b21b62e709c4a3de6884186316660b26d4135c89b799978852c581608c47222e020dd0547672a75103fd200ad0dd9da2c21443e718162b84adc15ae3637b7"

RPROVIDES:${PN} += "cross-ppc64-gcc16"

RDEPENDS:${PN} += "cross-ppc64-binutils \
libc.so.6"

inherit rpm
