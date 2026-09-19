SUMMARY = "Development Files for ZoiteChat"
DESCRIPTION = "This package includes files needed to develop ZoiteChat modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-devel-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "94b19936eb48a040b607a584b5ed1745f9b2f4e152bae5daa509d08c6ae4ae0c0e4ed9e31fa84abb715f6ee74f987c05b61eed5c18f092142631aceb690aa3a8"

RPROVIDES:${PN} += "pkgconfig-zoitechat-plugin \
zoitechat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
zoitechat"

inherit rpm
