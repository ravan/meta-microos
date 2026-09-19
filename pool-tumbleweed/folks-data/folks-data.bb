SUMMARY = "Data files for libfolks, a library to create metacontacts from many sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides mandatory data files for the library to work."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "folks-data-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "cb85b9040370e833bc5f12870d557c9a754adb1d03c0932d57b4ac9dc3a3b6baf3f8ce871e6976e5576fc48cd30150bd86b001f2a4d5914afb129cd1927f4a75"

RPROVIDES:${PN} += "folks-data \
libfolks-data"

RDEPENDS:${PN} += ""

inherit rpm
