SUMMARY = "Temporary buffer to save bytes"
DESCRIPTION = "Stream::Buffered is a buffer class to store arbitrary length of byte \
strings and then get a seekable filehandle once everything is buffered. It \
uses PerlIO and/or temporary file to save the buffer depending on the \
length of the size."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30.0"

RPM_NAME = "perl-Stream-Buffered-0.30.0-1.3.noarch.rpm"
RPM_HASH = "58de36311ad7256dd8e60468acbc9c220a8d9d47ff7744a1953878270f1d8e5cbfe9cbcf322e86510bbfcfb8e607b2177d2f7737d1c9a126d5a16f89f2f25356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stream--Buffered \
perl-Stream--Buffered--Auto \
perl-Stream--Buffered--File \
perl-Stream--Buffered--PerlIO \
perl-Stream-Buffered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--File"

inherit rpm
