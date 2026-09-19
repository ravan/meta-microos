SUMMARY = "Static library for libfallocate"
DESCRIPTION = "This package contains the static library for apps \
apps that want to use libfallocate statically."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-static-0.1.1-17.26.aarch64.rpm"
RPM_HASH = "2a91ca2677a6cc2e06d76c8447d8d7db0ad197f577ccc5d2b16ce9524283bc9116097b7aafe5cacdea6c44d8f2261b34066a774962881033aac67af9755b8ed2"

RPROVIDES:${PN} += "libfallocate-devel-static"

RDEPENDS:${PN} += "libfallocate-devel"

inherit rpm
