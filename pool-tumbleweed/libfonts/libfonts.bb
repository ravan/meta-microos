SUMMARY = "TrueType Font Layouting"
DESCRIPTION = "LibFonts is a library developed to support advanced layouting in JFreeReport. \
This library allows to read TrueType font files to extract layouting specific \
information."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-1.1.6-2.9.noarch.rpm"
RPM_HASH = "96fa109c2680b0aa955d7345b371905267e5ed97f9720a9f53fd7bc06948afba8fc70494963a02f11648e33071cff4ca130e18a297fc449da0fe73cd49be036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts"

RDEPENDS:${PN} += "java \
jpackage-utils \
libloader"

inherit rpm
