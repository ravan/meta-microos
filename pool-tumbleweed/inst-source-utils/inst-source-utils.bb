SUMMARY = "Utilities for creating customized installation sources"
DESCRIPTION = "Utilities supporting autoinstallation and creation of customized \
installation  sources. \
 \
Have a look at http://en.opensuse.org/Inst-source-utils for a detailed \
description of each script."
LICENSE = "GPL-2.0-or-later"

PV = "2023.11.08"

RPM_NAME = "inst-source-utils-2023.11.08-1.9.noarch.rpm"
RPM_HASH = "8362f15c9f38c54717aa7762d29215f27e5c0d18ad9844fd52617e8bf51b79925880dbfbd95d3d0ee9a71a7dd09dcbc7f629309344a46e8a826d113f68b54b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2-utils \
inst-source-utils \
perl-ABStructured \
perl-ABStructured--saxparser \
perl-ABXML \
perl-RPMQ"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gpg2 \
perl-XML-Parser \
zstd"

inherit rpm
