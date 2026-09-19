SUMMARY = "Generic colouriser for everything"
DESCRIPTION = "Generic Colouriser is yet another colouriser for beautifying your \
logfiles or commands output."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "grc-1.13-2.7.noarch.rpm"
RPM_HASH = "714271d0f3dc2f466abd54727e790fddb28ca61d021c152f4f5734eb0e427d59d6c137ee61e8de2cfe875594fb047b6338421738721ad19a589b0f7af4c48086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grc \
grc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
