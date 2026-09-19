SUMMARY = "Header files for MATE's dictionary library"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources. \
This package contains development files for libmatedict."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "libmatedict-devel-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "e1b49211296cc47aa5f0d64fb41cfe2a45fc1ff34d2db344511fbc3a44308bfe0d67dd2ac67a686ded7d36590b044e4717652f296440d490b8e2cdb48cddae19"

RPROVIDES:${PN} += "libmatedict-devel \
pkgconfig-mate-dict"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatedict6 \
pkgconfig-gtk+-3.0"

inherit rpm
