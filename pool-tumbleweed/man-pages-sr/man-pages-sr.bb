SUMMARY = "Translation of man pages in Serbian"
DESCRIPTION = "This package provides translations of man pages in Serbian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-sr-4.31.0-1.2.noarch.rpm"
RPM_HASH = "a106710b0981b01c3e7bc519d4659c1576b4efe2bfd079c94f89bbcdea660a21fbb490356a099eea17fcd50ae12f5752daa9272adc08a89ba388eacbc996de58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-sr \
man-pages-sr"

RDEPENDS:${PN} += "man-pages"

inherit rpm
