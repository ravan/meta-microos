SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language.  The entire \
language (core library, interpreter, compiler, assembler, PEG) is less \
than 2MB.  Janet scripting can be added to an application by embedding a \
single C source file and a single header."
LICENSE = "MIT"

PV = "1.39.0"

RPM_NAME = "janet-1.39.0-1.6.aarch64.rpm"
RPM_HASH = "e3f65bc1aad3e4f2e83217d5cff7e616e57b43427f526960c1630d043e75be85bfca90e007c9aa036d3bdae70ee0be04be2d3c5c7447ed006de9e192bef94008"

RPROVIDES:${PN} += "janet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjanet.so.1.39"

inherit rpm
