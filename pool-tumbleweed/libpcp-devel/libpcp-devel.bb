SUMMARY = "Performance Co-Pilot (PCP) development headers"
DESCRIPTION = "Performance Co-Pilot (PCP) headers for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp-devel-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "4ab251a95362ec5473856a71b669e46e8351faf5594d4dad81a7a637f990fad6dae3d92760b813777410095c4cfbf73d4c3b68b53fe8fedd5f255da5f1028261"

RPROVIDES:${PN} += "libpcp-devel \
pcp-devel \
pkgconfig-libpcp \
pkgconfig-libpcp-import \
pkgconfig-libpcp-pmda"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcp-gui2 \
libpcp-import1 \
libpcp-mmv1 \
libpcp-trace2 \
libpcp-web1 \
libpcp3"

inherit rpm
