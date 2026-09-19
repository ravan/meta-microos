SUMMARY = "Development package for the etesync shared library"
DESCRIPTION = "A C and Rust client library for EteSync. Development package."
LICENSE = "(Apache-2.0 | MIT) & BSD-2-Clause & BSD-3-Clause & Apache-2.0-with-LLVM-exception & CC-BY-SA-4.0 & MPL-2.0 & CC0-1.0 & (Apache-2.0 | BSL-1.0) & (GPL-2.0-or-later | MIT) & GPL-2.0-or-later-with-Autoconf-exception-3.0 & GPL-2.0-or-later-with-Libtool-exception"

PV = "0.5.8"

RPM_NAME = "libetebase-devel-0.5.8-1.8.aarch64.rpm"
RPM_HASH = "9e4621c61048d758907a81b04fa18256ccea6a012167b5f382c4145eb26acf1f4cfa1f0c52ce25b7793b3736ee4b95a02a9c2d7492d18486b2a67a8b0c4c0859"

RPROVIDES:${PN} += "cmake-Etebase \
libetebase-devel \
pkgconfig-etebase"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libetebase0"

inherit rpm
