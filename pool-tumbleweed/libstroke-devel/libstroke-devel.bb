SUMMARY = "Development package for libstroke"
DESCRIPTION = "This package is needed if you want to program or compile applications \
that use libstroke."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libstroke-devel-0.5.1-236.9.aarch64.rpm"
RPM_HASH = "8d3651f50b840261cb1f656996bacf76f9f3b325f1ad331ae8a1bd9a05777fe8c265696377c4339cd563cdbedc5412e9689f5299cc63107b2ae3197285abb079"

RPROVIDES:${PN} += "libstroke-devel"

RDEPENDS:${PN} += "libstroke0 \
pkgconfig-x11"

inherit rpm
