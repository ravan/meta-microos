SUMMARY = "Development files for zita-resampler"
DESCRIPTION = "Development files for zita-resampler including headers and libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "zita-resampler-devel-1.11.2-2.9.aarch64.rpm"
RPM_HASH = "62ecc5fea1bc289bf88484da0f8a60e3d9c255f0e7f372fe1cdf0a1c12b140581fe5119a6ca65a49b22fd51c88056bc2ea54185ee88ab8a6db1d6e7428559342"

RPROVIDES:${PN} += "zita-resampler-devel"

RDEPENDS:${PN} += "libzita-resampler1"

inherit rpm
