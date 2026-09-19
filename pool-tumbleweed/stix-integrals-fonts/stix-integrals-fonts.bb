SUMMARY = "STIX scientific and engineering fonts, additional integral glyphs"
DESCRIPTION = "This package includes fonts containing additional integrals of various size \
and slant."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-integrals-fonts-1.1.0-12.26.noarch.rpm"
RPM_HASH = "5aca0ff1e7725b3ddec7f31dcbfdc26e9dc00a8b86f2d1a71d7a1e00706fefb1feec13f946fa40574d4100a0814abcdc86ab4f67d90eca3aee9b06790490ff80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-stix-integrals-fonts \
font-stixintegralsd \
font-stixintegralssm \
font-stixintegralsup \
font-stixintegralsupd \
font-stixintegralsupsm \
stix-integrals-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl \
stix-fonts"

inherit rpm
