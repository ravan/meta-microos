SUMMARY = "Library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkexiv2-qt6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ac8eb708cf5cf5c2cbfb3f48b159b6d1af00b55ff2cd39f9393082c3f2f7fff57b40b1139f65bcb322001f3a931ef136fddab99b9f45feb4d4c3a18acca63cf6"

RPROVIDES:${PN} += "libkexiv2-qt6"

RDEPENDS:${PN} += ""

inherit rpm
