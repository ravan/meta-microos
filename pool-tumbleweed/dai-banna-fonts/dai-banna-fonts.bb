SUMMARY = "SIL New Tai Lue Font"
DESCRIPTION = "Dai Banna SIL is a Unicode font package for rendering New Tai Lue \
(Xishuangbanna Dai) characters."
LICENSE = "OFL-1.1"

PV = "4.000"

RPM_NAME = "dai-banna-fonts-4.000-1.3.noarch.rpm"
RPM_HASH = "f6aeaaf4dae4004902be16c6373ea84075635c1b355b90a23e1a4398c873835dc5cf6f9a01529b1fb464b01ff0be1b0192578d8482cd6f68ea33381f80a06054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dai-banna-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
