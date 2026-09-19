SUMMARY = "Scheme implementation with teaching tools"
DESCRIPTION = "Racket (formerly called PLT Scheme) is a multi-paradigm programming language \
in the Lisp/Scheme family, that also serves as a platform for language \
creation, design, and implementation. \
 \
The programming language is known for its powerful macro system which enables \
the creation of embedded and domain-specific languages, language constructs \
such as classes or modules, and separate dialects of Racket enable different \
semantics."
LICENSE = "Apache-2.0 | MIT"

PV = "9.1"

RPM_NAME = "racket-9.1-1.6.aarch64.rpm"
RPM_HASH = "f4feaa6a8e4cf52ad3982fba6cc59b12e860d9c0b5fcbba3ed96ad2bf68014834e2320ddabb6119df074d1670ab2efb686b3a935315e73896b1f90802f59886b"

RPROVIDES:${PN} += "racket \
racket-drracket \
racket-games \
racket-webserver"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcairo2 \
libedit0 \
libglib-2-0-0 \
libgtk-3-0 \
liblz4.so.1 \
libm.so.6 \
libpango-1-0-0 \
libsqlite3-0 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
