SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcrash-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "28356610214d1e2d3d0ade2343568747da93f15935f4bf8fa4cb62b5a8117e854f8acf1626318b11b6a393a613180f690ed63989d56da07916f7e40646615e3b"

RPROVIDES:${PN} += "kf6-kcrash"

RDEPENDS:${PN} += ""

inherit rpm
