SUMMARY = "Development files for libxdp"
DESCRIPTION = "The libxdp-devel package contains headers used for building XDP programs using \
libxdp."
LICENSE = "GPL-2.0-only"

PV = "1.6.3"

RPM_NAME = "libxdp-devel-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "735c2671e0c9f76de44c03c9d5ec461a079f0333eeab7af61d1efa5195f6600f6930314962fd7c03e3c0f3e69780ad188ad2e434c6fd765511f4767125724b5b"

RPROVIDES:${PN} += "libxdp-devel \
pkgconfig-libxdp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernel-devel \
libxdp1 \
pkgconfig-libbpf"

inherit rpm
