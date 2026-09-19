SUMMARY = "Default sRGB ICC profile +"
DESCRIPTION = "The 'WWW standard' sRGB colorimetry in a ICC profile and others."
LICENSE = "Zlib"

PV = "1.3"

RPM_NAME = "icc-profiles-openicc-rgb-1.3-16.29.noarch.rpm"
RPM_HASH = "c8a201667b533f8555c924fe3fafb07cf6af083cd62d6a36704dd96d81bf80e77804c0bc15111f6cbb70ec0c69c53fee0003106188d00557c24bdd87dd9b2f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-openicc-rgb"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
