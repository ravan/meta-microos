SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-arm-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "f2d65ae11f3762711f0159604ba0a2446ca865c1b829f30aa157efbfa11c317e860665f6e4501d6b1d50946d484f786d99c5e9b2873aaf7bdd88aed0e4bdf255"

RPROVIDES:${PN} += "cross-arm-gcc16"

RDEPENDS:${PN} += "cross-arm-binutils \
libc.so.6"

inherit rpm
