SUMMARY = "Contemporary Geometric Sans Serif Typeface"
DESCRIPTION = "Exo is a contemporary geometric sans serif typeface that \
tries to convey a technological/futuristic feeling while \
keeping an elegant design. Exo was meant to be a very \
versatile font, so it has 9 weights (the maximum on the web) \
each with a true italic version. It works great as a display \
face but it also works good for small to intermediate size texts. \
 \
Designer: Natanael Gama"
LICENSE = "OFL-1.1"

PV = "0.9pre"

RPM_NAME = "google-exo-fonts-0.9pre-12.25.noarch.rpm"
RPM_HASH = "2a335309d2457e51701e766467b754c03b8e34399451c02aefba784260358be87ff446200e85018e9c14cbe29d5d29b3d8088ab648735cba1f684ff644493b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-exo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
