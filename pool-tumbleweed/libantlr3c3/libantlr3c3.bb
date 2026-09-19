SUMMARY = "C runtime for the ANTLR parsing library"
DESCRIPTION = "ANTLR, ANother Tool for Language Recognition, is a language tool that provides a \
framework for constructing recognizers, interpreters, compilers, and translators \
from grammatical descriptions containing actions in a variety of target \
languages. ANTLR provides excellent support for tree construction, tree walking, \
translation, error recovery, and error reporting."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "libantlr3c3-3.4-5.9.aarch64.rpm"
RPM_HASH = "406ef71b0c090c6e4360cf1325aa44a56c89e279b7a5fbd8f0356723c5c688804b0b30f97d00fc5047e0831013a1afd1bb91baeb7ba81b25af8189fd534e729a"

RPROVIDES:${PN} += "libantlr3c.so.3 \
libantlr3c3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
