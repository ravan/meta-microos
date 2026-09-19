SUMMARY = "Interface to the CommonMark C library"
DESCRIPTION = "This module is a wrapper around the official CommonMark C library at \
https://github.com/commonmark/cmark/. It closely follows the original API. \
 \
The main module provides some entry points to parse documents and \
convenience functions for node creation. The bulk of features is available \
through CommonMark::Node objects of which the parse tree is made. \
CommonMark::Iterator is a useful class to walk through the nodes in a tree. \
CommonMark::Parser provides a push parser interface."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.310.100"

RPM_NAME = "perl-CommonMark-0.310.100-2.9.aarch64.rpm"
RPM_HASH = "fc8f4c6c6274a2dd153881ec89396d3445c52949c20fffb52fee14d3239d6c61a0f952c6e3b9ae7e644e368bbef83cf544a2bd27069cd8765f900893e2a0a40a"

RPROVIDES:${PN} += "perl-CommonMark \
perl-CommonMark--Node"

RDEPENDS:${PN} += "cmark \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark.so.0.31.1 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
