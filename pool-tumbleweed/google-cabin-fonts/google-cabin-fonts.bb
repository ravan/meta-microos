SUMMARY = "Humanist Sans Serif Font"
DESCRIPTION = "The Cabin font family is a humanist sans with 4 weights and true italics, \
inspired by Edward Johnston’s and Eric Gill’s typefaces, with a touch of \
modernism. Cabin incorporates modern proportions, optical adjustments, and some \
elements of the geometric sans. It remains true to its roots, but has its own \
personality. \
 \
The weight distribution is almost monotone, although top and bottom curves are \
slightly thin. Counters of the b, g, p and q are rounded and optically \
adjusted. The curved stem endings have a 10 degree angle. E and F have shorter \
center arms. M is splashed. \
 \
Designer: Pablo Impallari"
LICENSE = "OFL-1.1"

PV = "3.001+git1595464381.70efa8c"

RPM_NAME = "google-cabin-fonts-3.001+git1595464381.70efa8c-1.14.noarch.rpm"
RPM_HASH = "49ad839e04ebff15c2bc36c83d441ca4af14290cdaa488a3c426c657dfdd67c305e6ee3e929021cee3bf9be963843200207fad3383b994d3f93ff5253c24faf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cabin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
