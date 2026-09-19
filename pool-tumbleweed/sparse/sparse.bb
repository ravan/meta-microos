SUMMARY = "A semantic parser of source files"
DESCRIPTION = "Sparse is a semantic parser of source files: it's neither a compiler \
(although it could be used as a front-end for one) nor is it a \
preprocessor (although it contains as a part of it a preprocessing \
phase). \
 \
It is meant to be a small - and simple - library.  Scanty and meager, \
and partly because of that easy to use.  It has one mission in life: \
create a semantic parse tree for some arbitrary user for further \
analysis.  It's not a tokenizer, nor is it some generic context-free \
parser.  In fact, context (semantics) is what it's all about - figuring \
out not just what the grouping of tokens are, but what the _types_ are \
that the grouping implies. \
 \
Sparse is primarily used in the development and debugging of the Linux \
kernel."
LICENSE = "MIT"

PV = "0.6.5~rc1+20251218"

RPM_NAME = "sparse-0.6.5~rc1+20251218-1.2.aarch64.rpm"
RPM_HASH = "8a4b8e62f70435650410b3ab85e1b415be53ec3d22de6e351fa10d75c984dfc6ada62e1569277d62cea663be1af4fc9f0b8df3f4f139ca20bdb88c5b7d480551"

RPROVIDES:${PN} += "sparse"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
