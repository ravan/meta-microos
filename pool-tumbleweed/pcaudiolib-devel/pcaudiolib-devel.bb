SUMMARY = "Development files for libpcaudio0"
DESCRIPTION = "The Portable C Audio Library (pcaudiolib) provides a C API to different audio devices."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "pcaudiolib-devel-1.3-1.6.aarch64.rpm"
RPM_HASH = "68069bc87e1fe01e91b7f936050e0b499c33a25d4b6e6f3d4d7f86a80df7aea1632a096695f60f3dc3aac9274af355b67e9a850846d1e159caab68a8ad0704c1"

RPROVIDES:${PN} += "pcaudiolib-devel"

RDEPENDS:${PN} += "libpcaudio0"

inherit rpm
