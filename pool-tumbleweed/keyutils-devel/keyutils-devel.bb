SUMMARY = "Development package for building linux key management utilities"
DESCRIPTION = "This package provides headers and libraries for building key utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "keyutils-devel-1.6.3-7.10.aarch64.rpm"
RPM_HASH = "7f420922c48f03a91fbb0d6093cd80dc131961e3b1caf3783d73305af680f08146ef3ebd94780d9363783eeaedc42fb8e827d64c2cf02a9849366a93d8591bc3"

RPROVIDES:${PN} += "keyutils-devel \
pkgconfig-libkeyutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkeyutils1"

inherit rpm
