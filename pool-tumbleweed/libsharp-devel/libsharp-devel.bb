SUMMARY = "Headers and devel files for libsharp"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the headers and devel files for developing applications \
against libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp-devel-1.0.0-1.22.aarch64.rpm"
RPM_HASH = "fc9b4e2c19a7828f2c7c608c5b782ff3631d34282c73f7c32fc32298703722063ed291dbf7ca0f0ac58bf705c9717d7d2fca89d0726f04568048cd028b14ac45"

RPROVIDES:${PN} += "libsharp-devel \
pkgconfig-libsharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsharp0"

inherit rpm
