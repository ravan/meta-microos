SUMMARY = "Powerline Fonts"
DESCRIPTION = "This package provides the powerline fonts."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "powerline-fonts-2.8.4-3.5.noarch.rpm"
RPM_HASH = "6ba95c1f9278171c61dba422c7c18c10ff590bd328360eaa39fdad4768d286d16025ec2d91bd9612f53ef6fef77d83425577928bfc19421ee6c2428ee4615629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-powerlinesymbols \
powerline-fonts"

RDEPENDS:${PN} += "fontconfig"

inherit rpm
