SUMMARY = "Development libraries for subrandr}"
DESCRIPTION = "The subrandr-devel package contains C header files for \
developing applications that use subrandr."
LICENSE = "MPL-2.0"

PV = "1.4.0"

RPM_NAME = "subrandr-devel-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "7f23872fbe55ba19815f040e4905c830b76cca39c2aeff94fd56ca48cce7154e98d5139e4904b6a63caaea07f62a863202f809a4d077780230dfc917a6608732"

RPROVIDES:${PN} += "pkgconfig-subrandr \
subrandr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubrandr0 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-harfbuzz"

inherit rpm
