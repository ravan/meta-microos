SUMMARY = "GAP: A Demo for Package Authors"
DESCRIPTION = "The Example package, as its name suggests, is an example of how to \
create a GAP package. It has little functionality except for being a \
package, however, it contains an extensive appendix with guidelines \
for package authors."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.1"

RPM_NAME = "gap-example-4.4.1-1.5.aarch64.rpm"
RPM_HASH = "ad6ab902f9cb243d0950c36151dc3a157bc0e728ee9a9f164e9111dc39a88e4290c2cadd2aeb298db5039463f92550bebc1d1585c392baed377933820a4ff3bd"

RPROVIDES:${PN} += "gap-example"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
libc.so.6"

inherit rpm
