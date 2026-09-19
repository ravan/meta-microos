SUMMARY = "Tiro Devanagari Hindi Fonts"
DESCRIPTION = "Tiro Devanagari Hindi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devahindi-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "bba12e18269deda70b7411f0842ab7e0877f430101b81d24e8d0aab24c88c3c762820791f3c81c58054e3887bcfe83d7359e9f80b2758755bfafaf01d8b9a0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devahindi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
