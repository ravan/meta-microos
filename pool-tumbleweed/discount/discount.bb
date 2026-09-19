SUMMARY = "Markdown text to HTML converter"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.2.0"

RPM_NAME = "discount-3.0.2.0-1.1.aarch64.rpm"
RPM_HASH = "25ab1e6b38237bef0ae5f7b808e38ccc11be0319af93edc5158e68fc5c67411ab5200a6237e7be0aeefcbd5232e35f2edf47485ddab8d379a5815e7893e21ace"

RPROVIDES:${PN} += "discount \
markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmarkdown.so.3 \
update-alternatives"

inherit rpm
