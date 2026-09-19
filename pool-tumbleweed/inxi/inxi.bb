SUMMARY = "A system information script"
DESCRIPTION = "inxi is a command line system information tool. It was forked from \
infobash. The primary purpose of inxi is for support, and sys admin \
use. inxi is used widely for forum and IRC support."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.41"

RPM_NAME = "inxi-3.3.41-1.1.noarch.rpm"
RPM_HASH = "73d74afca8f26b37de552357775f9597af3565ef80d0087ed5ef5c2f88f52a59bab8c79e672bcbfd6cb927be13dabe0b0607ab4bce8351e8bb7bf70932ae553d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inxi"

RDEPENDS:${PN} += "/usr/bin/perl \
pciutils \
procps \
util-linux"

inherit rpm
