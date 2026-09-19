SUMMARY = "Development files for CLI11"
DESCRIPTION = "CLI11 is a command line parser for C++11 and beyond that provides a \
rich feature set. It is header only, and has a number of design \
limits by choice: \
 \
 * No completion of partial options (like --ve for --version, \
   if it were unambiguous) \
 * No wide strings/Unicode"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "cli11-devel-2.7.2-1.1.noarch.rpm"
RPM_HASH = "98752e82bc94cc6e58bedc393967001a05d6fb26bfe473946e575f4138af796ee1acc86a58698e0cbc2f58f7ad3d98d6420951643063e06deb22e6c9ab8f76b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cli11-devel \
cmake-CLI11 \
pkgconfig-CLI11"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
