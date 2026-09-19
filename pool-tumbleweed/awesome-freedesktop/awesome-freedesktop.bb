SUMMARY = "Desktop entries and menu for awesome"
DESCRIPTION = "This project aims to add support for freedesktop.org compliant \
desktop entries and menu. \
 \
Main features: \
 * a freedesktop.org-compliant (or almost) applications menu. \
 * a freedesktop.org-compliant (or almost) desktop. \
 * a (yet limited) icon lookup function. \
 \
You can choose any icon theme that's installed in /usr/share/icons/."
LICENSE = "GPL-2.0+"

PV = "git201701091085"

RPM_NAME = "awesome-freedesktop-git201701091085-1.23.noarch.rpm"
RPM_HASH = "502e58456e49885090c5c7523097aa5ad5c6827bf53cf8d738e2787f2f8f39df98a1a5b0cdfc5ef3bd4102ff6a40340c330154017f3327b81afa145181007e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-freedesktop"

RDEPENDS:${PN} += "awesome"

inherit rpm
