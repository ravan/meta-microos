SUMMARY = "Vector/OTF versions of the Darwin console font"
DESCRIPTION = "The 8x16 system console font from the MacOS kernel, Darwin (XNU)."
LICENSE = "APSL-2.0"

PV = "20211008"

RPM_NAME = "consoleet-darwin-fonts-20211008-1.14.noarch.rpm"
RPM_HASH = "9c77c4ea34a56f5d88df65e5e1c45aed5c9138352c27ff40ea3ee16e2a6fcdc4587bc8b716b2fa84319f13dee85e055744ffebea7b373c1498a813bc32def950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-darwin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
