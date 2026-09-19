SUMMARY = "Development files for the VBI decoding library"
DESCRIPTION = "This package includes the development files for the zvbi library which \
provides routines to read from raw VBI sampling devices, to demodulate raw to \
sliced VBI data, and to interpret the data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.45"

RPM_NAME = "zvbi-devel-0.2.45-1.1.aarch64.rpm"
RPM_HASH = "816751e52a031a0f40f8baae64925d783cb41a47c14438fb86e51c1aa533ad4e8048d79763946593126f0416242194011ec3ef6155c6ef3e5a762901599d3ea2"

RPROVIDES:${PN} += "pkgconfig-zvbi-0.2 \
zvbi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzvbi-chains0 \
libzvbi0"

inherit rpm
