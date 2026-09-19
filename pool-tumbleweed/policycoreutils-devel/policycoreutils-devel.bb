SUMMARY = "SELinux policy core policy devel utilities"
DESCRIPTION = "The policycoreutils-devel package contains the management tools use to develop policy in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-devel-3.11-2.2.aarch64.rpm"
RPM_HASH = "aeb9aa7fe2ce2d7b3ddf9aeb4ca2427df37d6bafbc06b745eb027009ffeeb0db6eca5bbc037887a00c777c2ff92a83935c45e10a3cb08fdebec95697b1e353d2"

RPROVIDES:${PN} += "policycoreutils-devel"

RDEPENDS:${PN} += "/usr/bin/make \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
python3-distro \
python3-policycoreutils"

inherit rpm
