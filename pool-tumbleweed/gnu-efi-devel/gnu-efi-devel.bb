SUMMARY = "Development files for gnu-efi"
DESCRIPTION = "A package containing the development files for gnu-efi, \
which is used for developing EFI applications using the GNU toolchain"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.0.4"

RPM_NAME = "gnu-efi-devel-4.0.4-1.4.aarch64.rpm"
RPM_HASH = "2f402bcedc0dbfdc984d2d25354135d3f78545c29616c16242646823769fd52bb812c5553aaf981eeb1ea5487362ee17a4aa8841960ad8a097dfa913e6a32fbe"

RPROVIDES:${PN} += "gnu-efi \
gnu-efi-devel \
pkgconfig-gnu-efi"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
