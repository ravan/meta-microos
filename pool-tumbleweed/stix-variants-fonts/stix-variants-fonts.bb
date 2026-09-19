SUMMARY = "STIX scientific and engineering fonts, additional glyph variants"
DESCRIPTION = "This package includes fonts containing alternative variants of some glyphs."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-variants-fonts-1.1.0-12.26.noarch.rpm"
RPM_HASH = "1b7addc790dc1166bc0c0029647c814adb464d9dcfc73ca0aae85bb10cca82b02d411f6818102918d3f18d1906bfd5344dad05398ce75e31f3d0e92f25a77085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-stix-variants-fonts \
font-stixvariants \
stix-variants-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl \
stix-fonts"

inherit rpm
