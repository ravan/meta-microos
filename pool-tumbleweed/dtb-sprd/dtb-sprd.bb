SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-sprd-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "49c929ad0dbe9c9c89edae5e125d920cd8157edd42648d465baf301e6534dce624672e83d8b718cf932ceb0dd3fbe2f3d5e6bdd7536c15111e6c82a69cbc0bad"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
