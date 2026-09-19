SUMMARY = "JetBrains Mono: a typeface for developers"
DESCRIPTION = "A typeface made for developers. \
 \
Designer: Philipp Nurullin"
LICENSE = "OFL-1.1"

PV = "2.304"

RPM_NAME = "jetbrains-mono-fonts-2.304-1.10.noarch.rpm"
RPM_HASH = "b56474b9bd14b18367b018b26446929bbb948a8139a6c1f66bb91bfe480b942a7a587b398f9b087f0dab25a06af5ddc2a571f54a51bb0d891276dd84c0e81f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
