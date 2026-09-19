SUMMARY = "Provides libknet1 crypto plugins meta package"
DESCRIPTION = "Provides meta package to install all of libknet1 crypto plugins"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-crypto-plugins-all-1.33-2.2.aarch64.rpm"
RPM_HASH = "5ce4dd1d7fe81942382a316c23faf0934d094b30afb3735bb909ef13683ec0ce87070ef30c5c17cf4752482aacb6668a1a17eb946688a7ba27b925e03e9e24a4"

RPROVIDES:${PN} += "libknet1-crypto-plugins-all"

RDEPENDS:${PN} += "libknet1-crypto-nss-plugin \
libknet1-crypto-openssl-plugin"

inherit rpm
