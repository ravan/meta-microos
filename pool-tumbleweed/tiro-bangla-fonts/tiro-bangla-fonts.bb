SUMMARY = "Tiro Bangla Fonts"
DESCRIPTION = "Tiro Bangla has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-bangla-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "7b64190858611364f6e60acf5c54b5d2a527ff17af8c4297797512338b518afa08a911ac1daf881d51db47c217b73b7025aae2c387bc70cb9e44b35ad6b8f675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-bangla-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
