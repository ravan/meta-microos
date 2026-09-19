SUMMARY = "Tiro Fonts for some of the major Indian writing systems"
DESCRIPTION = "This packages contains all of the Tiro Indigo Fonts which have their \
origins in a typeface designed for the Murty Classical Library of India \
book series, so is especially suited to traditional literary publishing \
but also made with the needs of today’s multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-indigo-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "ba767fe3fd217b668899cf8ee5ec09be9d94522bab10841fba7e6aa1d31982c1318230d4209cd499732d0f86d5b8c222d210ddc7fba32b52285495a8f5fa04a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-indigo-fonts"

RDEPENDS:${PN} += "tiro-bangla-fonts \
tiro-devahindi-fonts \
tiro-devamarathi-fonts \
tiro-devasanskrit-fonts \
tiro-gurmukhi-fonts \
tiro-kannada-fonts \
tiro-tamil-fonts \
tiro-telugu-fonts"

inherit rpm
