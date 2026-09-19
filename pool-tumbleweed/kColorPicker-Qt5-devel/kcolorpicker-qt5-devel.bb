SUMMARY = "Development files for kColorPicker-Qt5"
DESCRIPTION = "Development files for kColorPicker-Qt5 including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "kColorPicker-Qt5-devel-0.3.1-1.9.aarch64.rpm"
RPM_HASH = "1211fd9f38608abfb1d81ea70ae252035ad5dbcf7d4043d80c5739e8db4190f42899f9944ee1ed6e9a401e1da12fbe8ab3da07c6687417b7204eec4350df562e"

RPROVIDES:${PN} += "cmake-kColorPicker-Qt5 \
kColorPicker-Qt5-devel"

RDEPENDS:${PN} += "libkColorPicker-Qt5-0"

inherit rpm
