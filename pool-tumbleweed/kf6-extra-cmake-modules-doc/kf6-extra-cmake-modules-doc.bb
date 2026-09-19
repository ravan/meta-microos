SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for kf6-extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "6.30.0"

RPM_NAME = "kf6-extra-cmake-modules-doc-6.30.0-1.1.noarch.rpm"
RPM_HASH = "8c76dc68e13700ac7eab00d287d1582581c10ed6839ba1664f4af9f959cdc0ec9ad03ab586bc0acb6639c0cfdad1bef67624b14c760c6e3b1d729c9a8e10de0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc \
kf6-extra-cmake-modules-doc"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
