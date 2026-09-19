SUMMARY = "Junge Font"
DESCRIPTION = "Junge is an elegant and slim text typeface inspired by the calligraphy \
of Günther Junge. Thanks to a combination of features it performs \
equally well in most ranges. At small sizes it builds the impression of \
flittering strokes. In large headlines its refined detailing become \
visible. It is not as strictly structured as a text typeface, and has \
subtle irregularities reminiscent of its calligraphic origin."
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "cyreal-junge-fonts-1.002-7.25.noarch.rpm"
RPM_HASH = "d46bf4d30777a926f486168a0f13eb3c279123d1e755d42232cdc537522a97b1237c54d38c915645a6e8ea99cb09bcf14af60d3b8e1680570dd279ad18b9f50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-junge-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
