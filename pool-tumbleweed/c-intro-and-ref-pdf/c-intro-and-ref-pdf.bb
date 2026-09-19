SUMMARY = "GNU C Language Intro and Reference - info version - HTML version - PDF version"
DESCRIPTION = " \
This manual explains the C language for use with the GNU Compiler Collection (GCC) \
on the GNU/Linux system and other systems. We refer to this dialect as GNU C. \
If you already know C, you can use this as a reference manual. \
 \
This package provides the documentation in the PDF format."
LICENSE = "GFDL-1.3-or-later"

PV = "20240831.93.6296201"

RPM_NAME = "c-intro-and-ref-pdf-20240831.93.6296201-1.7.noarch.rpm"
RPM_HASH = "2234e557bf2e16d80c4f94b864a6502f9932dd16fd0f5999c805af7dca7123674dbe5e2c2a8ec1c443e8d56305dcbd4d38e29b5e0c8ac81e85365711d0021060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c-intro-and-ref-pdf"

RDEPENDS:${PN} += ""

inherit rpm
