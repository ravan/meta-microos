SUMMARY = "Arabic Naqsh Font"
DESCRIPTION = "Arabic TrueType font (Naqsh family)."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "arabic-naqsh-fonts-2.1-18.23.noarch.rpm"
RPM_HASH = "03979951b39fe8e47471983b85be1c1829f48fea21831d4093f7b1fc6bae38a6105f2c9b05a23b2fe198ca2c822b898a97fb4beac7e82f7023e1b5b6432f9e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-naqsh-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
