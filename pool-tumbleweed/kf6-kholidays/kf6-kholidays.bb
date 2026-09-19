SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kholidays-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "201d28cd33e7b3a87e3cbd33972c43901b0ecbf8117e3c599ec1408320ee8572ebc689ceca966f338bfd3026a3dbfb459eabab4a65ded647cc5063ad6532a7b6"

RPROVIDES:${PN} += "kf6-kholidays"

RDEPENDS:${PN} += ""

inherit rpm
