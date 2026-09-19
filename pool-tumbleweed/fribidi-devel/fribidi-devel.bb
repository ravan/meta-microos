SUMMARY = "Development Files for FriBiDi"
DESCRIPTION = "This package provides headers and manual files for FriBiDi."
LICENSE = "LGPL-2.1-only"

PV = "1.0.16"

RPM_NAME = "fribidi-devel-1.0.16-1.3.aarch64.rpm"
RPM_HASH = "47bd196627f54e37cf2b410df6703a8b3e481b52fbad3f8021c5328f2fa8fa41c88edb4c5de1a2f996a653a5e713144ca289faa60b3816650c0faeece916de29"

RPROVIDES:${PN} += "fribidi-devel \
pkgconfig-fribidi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfribidi0"

inherit rpm
