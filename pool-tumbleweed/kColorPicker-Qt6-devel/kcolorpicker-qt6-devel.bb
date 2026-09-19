SUMMARY = "Development files for kColorPicker-Qt6"
DESCRIPTION = "Development files for kColorPicker-Qt6 including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "kColorPicker-Qt6-devel-0.3.1-1.9.aarch64.rpm"
RPM_HASH = "184316d61a0119163942eab2679a38a20f1321bbc41de03424de2b79ef0d31c79790026583698bfddd851144337d8c8f6d17e4a36108a73fbf566db1a269fcff"

RPROVIDES:${PN} += "cmake-kColorPicker-Qt6 \
kColorPicker-Qt6-devel"

RDEPENDS:${PN} += "libkColorPicker-Qt6-0"

inherit rpm
