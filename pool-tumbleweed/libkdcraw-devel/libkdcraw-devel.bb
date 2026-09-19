SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdcraw-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b962530154e8736bfd68817bd92a86d3ac995001c6a6562ad2e7977bce0e233ff157ceacbb0f76dca48ad7d03435d521371c09fbf09d7dcc79c56302f87a625b"

RPROVIDES:${PN} += "cmake-KDcrawQt6 \
libkdcraw-devel"

RDEPENDS:${PN} += "libKDcrawQt6-5"

inherit rpm
