SUMMARY = "An English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology."
LICENSE = "LGPL-2.1-only"

PV = "5.12.5"

RPM_NAME = "liblink-grammar5-5.12.5-1.6.aarch64.rpm"
RPM_HASH = "f11dc18612eb066dc3f69aa0a61c593359424c65a879486d620b8b610dc11e2b41afd0242ba6b95e7d72e4ae668536900c12fdd7a9fa324ba6e336af1a4d4604"

RPROVIDES:${PN} += "liblink-grammar.so.5 \
liblink-grammar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhunspell-1.7.so.0 \
libm.so.6 \
libpcre2-8.so.0 \
libsqlite3.so.0"

inherit rpm
