SUMMARY = "The Inter font family (variable version)"
DESCRIPTION = "Inter is a typeface specially designed for user interfaces with focus on high \
legibility of small-to-medium sized text on computer screens. \
 \
This package contains the variable version of fonts."
LICENSE = "OFL-1.1"

PV = "4.1"

RPM_NAME = "inter-variable-fonts-4.1-1.3.noarch.rpm"
RPM_HASH = "81bcdf4a6da01f4b84621d84987afbda5ff927ec262a02e8e4cd8216142ac53a703eb7c6a84909d7d8f0f55d196bd0b416bc01a629c9c6ebe4571a8648209608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inter-variable-fonts"

RDEPENDS:${PN} += ""

inherit rpm
