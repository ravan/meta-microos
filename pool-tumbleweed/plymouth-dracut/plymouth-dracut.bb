SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "c65d1e056fcf77adbf59da94d344a81c0c422a06304bdf9faad5f997902e9d71ddc541899b2216bb6d2783d5b849b47a0ac552dbe904c916081057db3f82accb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
plymouth"

inherit rpm
