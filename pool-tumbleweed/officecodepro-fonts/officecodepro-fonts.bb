SUMMARY = "A set of OpenType fonts designed for coding environments"
DESCRIPTION = "Office Code Pro is a customized version of Source Code Pro, the monospaced sans serif \
originally created by Paul D. Hunt for Adobe Systems Incorporated. The customizations \
were made specifically for text editors and coding environments, but are still very \
usable in other applications."
LICENSE = "OFL-1.1"

PV = "1.004"

RPM_NAME = "officecodepro-fonts-1.004-1.18.noarch.rpm"
RPM_HASH = "e586c9aacefe792c1d0144f226b1f368ead7c518de2c1a450eb6ea45e095fa0b12c9e5cedd6e284a830095a37c415c5cae35694181b5a434a8ac059040b34202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "officecodepro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
