SUMMARY = "This package contains the paper library"
DESCRIPTION = "This package provides the paper library"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libpaper2-2.2.8-1.3.aarch64.rpm"
RPM_HASH = "cf2bf3cbe2a721ce60d4933e383024e883f970e53b88ca8013fe5e6686752f8b892333a390583404e0dd67fddc5ee103a55965ca3824eff07d9b251ade045ab8"

RPROVIDES:${PN} += "libpaper.so.2 \
libpaper2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpaper"

inherit rpm
