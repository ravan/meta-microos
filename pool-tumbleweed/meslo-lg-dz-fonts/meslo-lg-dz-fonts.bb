SUMMARY = "Meslo LG Font Family"
DESCRIPTION = "Meslo LG is a customized version of Apple's Menlo-Regular font (which is \
a customized Bitstream Vera Sans Mono). This is the dotted zero version \
of Meslo LG which is called Meslo LG DZ."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "meslo-lg-dz-fonts-1.2.5-1.4.noarch.rpm"
RPM_HASH = "de50ed9bdfd97cbb2d44976b3c12d4a6ffb5e1ca6b1917beed3627fddbf28be031a4da7067641c5ecce8b6acba187c3fcfbe498317a82e2fd18d7c65d088630f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meslo-lg-dz-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
