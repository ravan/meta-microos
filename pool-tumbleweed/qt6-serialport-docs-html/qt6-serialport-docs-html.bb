SUMMARY = "Documentation for qt6-serialport in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialport in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-serialport-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a6d070c768145abf9c9c358197b0a7a783663cad106336d0ab2176ed219fe7fd73fb7fee1979db67e4812ac1cfc4f192b0b0c186a1f0a00cd536d8bb4df2c88a"

RPROVIDES:${PN} += "qt6-serialport-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
