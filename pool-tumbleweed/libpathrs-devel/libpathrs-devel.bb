SUMMARY = "Development files for libpathrs"
DESCRIPTION = "libpathrs implements a set of C-friendly APIs (written in Rust) to make path \
resolution within a potentially-untrusted directory safe on GNU/Linux. There \
are countless examples of security vulnerabilities caused by bad handling of \
paths (symlinks make the issue significantly worse). \
 \
This subpackage provides the development headers for libpathrs."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.2.6"

RPM_NAME = "libpathrs-devel-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "f419afec2523fb02ee55422cdf6afc88cf53388fcb2ca08c5862bc686d8a4016e62d72fba522917e6e09100a756dd2873d3054524286cba94110d3a8b7be4315"

RPROVIDES:${PN} += "libpathrs-devel \
pkgconfig-pathrs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpathrs0"

inherit rpm
