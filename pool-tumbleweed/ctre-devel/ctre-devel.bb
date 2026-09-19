SUMMARY = "Header and cmake files for ctre, a regular expressions library"
DESCRIPTION = "This package provides the header files and other development files needed for \
developing applications against ctre."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "ctre-devel-3.11.0-2.1.aarch64.rpm"
RPM_HASH = "0bad83d49d72f3d870ef7e71b42b707c5a34a2e3e27e3b9aadc7b1148971b409c053ce456f9f3b3ed8000e076fce343034a6fc871ba1f2290c8baf139c01716f"

RPROVIDES:${PN} += "cmake-ctre \
ctre-devel \
pkgconfig-ctre"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
