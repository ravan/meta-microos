SUMMARY = "The binfmt_misc support for Windows"
DESCRIPTION = "Run Windows(tm) executables out of the box."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-1.2.1-2.3.noarch.rpm"
RPM_HASH = "267c47f7fbf4b4afb51d098e530f547c012208d0963cdb351c9be54ffbbe4308252ea24856c2243eef5c03d79c38607aa14efabf74b0c178026c14375107f2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd \
wine"

inherit rpm
