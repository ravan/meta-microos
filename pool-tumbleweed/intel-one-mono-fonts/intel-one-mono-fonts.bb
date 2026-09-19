SUMMARY = "An expressive monospaced font family"
DESCRIPTION = "Intel One Mono is an expressive monospaced font family. \
 \
Identifying the typographically underserved low-vision developer \
audience, Frere-Jones Type designed the Intel One Mono typeface in \
partnership with the Intel Brand Team and VMLY&R, for maximum \
legibility to address developers' fatigue and eyestrain and reduce \
coding errors. A panel of low-vision and legally blind developers \
provided feedback at each stage of design."
LICENSE = "OFL-1.1-RFN"

PV = "1.4.0"

RPM_NAME = "intel-one-mono-fonts-1.4.0-1.7.noarch.rpm"
RPM_HASH = "7ba7670ee75f584dd4d935dd961192d88edd2ddd569f14482cb05367e06b9ae31df74e2a4b1343636b2b0acf6fc1fe12ae548b7028534a3f041eb00881fccb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intel-one-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
