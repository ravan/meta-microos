SUMMARY = "Radiance Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk2-metatheme-radiance-20.10-2.10.noarch.rpm"
RPM_HASH = "da57aa6933847a8cf32d34b3f395ee6808277b6db7955f85101d85617b2f1590bf7419f38998870be361b40bbd6182abdbd690c6a50731a22a1c1311d67d2b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-radiance"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-radiance-common"

inherit rpm
