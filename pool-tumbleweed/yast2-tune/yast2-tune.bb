SUMMARY = "YaST2 - Hardware Tuning"
DESCRIPTION = "This package contains the YaST2 component for hardware configuration."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-tune-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "09dd21f6d24dec3a6826c5b946da3023476c43198cb22c8dce8dd78432ff74cfa7ec9748a146abb7e4ec8a089a78fbd6b2749224d4b63795c6a29c377919a429"

RPROVIDES:${PN} += "yast2-tune"

RDEPENDS:${PN} += "/usr/bin/sh \
yast2 \
yast2-bootloader \
yast2-ruby-bindings"

inherit rpm
