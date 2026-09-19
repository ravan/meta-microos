SUMMARY = "Development files for the Algorithmic Differentiation Library"
DESCRIPTION = "This package provides the development environment for ADOL-C \
(Automatic Differentiation by OverLoading in C++)."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-devel-2.7.2-5.5.aarch64.rpm"
RPM_HASH = "ded25360f5c8a76504bde9761bde809d6719ab0d20cc845bba196b88ef643eb5eef4c47a9d21318f8829eb43fdf64aedb287944fa6222edd0e95f8bf4cd6ae07"

RPROVIDES:${PN} += "adolc-devel \
pkgconfig-adolc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadolc2"

inherit rpm
