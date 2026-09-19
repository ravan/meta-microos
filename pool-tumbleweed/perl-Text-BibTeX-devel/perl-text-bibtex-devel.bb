SUMMARY = "C library for parsing and processing BibTeX files"
DESCRIPTION = "The libbtparse is a C library for parsing and processing BibTeX files. \
Note that the interface provided by libbtparse, while complete, is fairly \
low-level.  If you have more sophisticated needs, you might be interested \
the 'Text::BibTeX' module for Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.910.0"

RPM_NAME = "perl-Text-BibTeX-devel-0.910.0-1.11.aarch64.rpm"
RPM_HASH = "2e785c9a14c3e69d45f3daca5902b14fe0407544abe68b0544b64be145cf9a0d6e86c3d95241de629f0e2d76dd39db0b4596e5940e2b05c633522ee68504bc99"

RPROVIDES:${PN} += "libbtparse.so \
perl-Text-BibTeX-/usr/lib64/libbtparse.so \
perl-Text-BibTeX-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
