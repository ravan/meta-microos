SUMMARY = "Not Quite Perl"
DESCRIPTION = "This is 'Not Quite Perl' -- a lightweight Raku-like environment for virtual \
machines. The key feature of NQP is that it's designed to be a very small \
environment (as compared with, say, raku or Rakudo) and is focused on being \
a high-level way to create compilers and libraries for virtual machines like \
MoarVM, the JVM, and others. \
 \
Unlike a full-fledged implementation of Raku, NQP strives to have as small a \
runtime footprint as it can, while still providing a Raku object model and \
regular expression engine for the virtual machine."
LICENSE = "Artistic-2.0"

PV = "2025.05"

RPM_NAME = "nqp-2025.05-1.5.aarch64.rpm"
RPM_HASH = "b659fb24fbe485329b41a051b95d7ee0aa11e4d013e605bb72223c4393527f690038204fcf8962b879af2ce9ea849693f9e40fec6cfe4e497f37f1d8e615fafa"

RPROVIDES:${PN} += "nqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmoar.so \
moarvm"

inherit rpm
