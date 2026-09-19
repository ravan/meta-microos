SUMMARY = "An utility for changing configuration files"
DESCRIPTION = "An utility for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "9ec178a18dcf4194f3e2e3608da5c92244075152573b75cfceeeaff350b4642830e5e74bfb6b88339271f5eb89eecd9daddeffaf2ae3c5f0f46177fb11fa193a"

RPROVIDES:${PN} += "augeas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libfa.so.1 \
libgcc-s.so.1 \
libreadline.so.8"

inherit rpm
