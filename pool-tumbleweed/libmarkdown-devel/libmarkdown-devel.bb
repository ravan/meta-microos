SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.2.0"

RPM_NAME = "libmarkdown-devel-3.0.2.0-1.1.aarch64.rpm"
RPM_HASH = "112dfa31c17b3408243069bc3b2f7ef79da12f005d8cb6949c254764ec54648008bb9c8f521621689a632f1e280cc3166dcd808630971775719d566a897d1e82"

RPROVIDES:${PN} += "libmarkdown-devel \
pkgconfig-libmarkdown"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmarkdown3"

inherit rpm
