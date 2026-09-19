SUMMARY = "A ligatureless variant of the Kende Old Hungarian font"
DESCRIPTION = "Roga is the ligatureless version of the Kende font. Both are fonts \
for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20230908"

RPM_NAME = "rovasiras-roga-fonts-20230908-1.9.noarch.rpm"
RPM_HASH = "54b4948fa62c637e90df483d5950df00c89ae3cb6e8d26e613c8d8af85547b03e9e09a950ecfe2175257ee9c34c143da14b2ca83599d1dd042ddfb561ef766ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-roga-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
