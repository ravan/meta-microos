SUMMARY = "GNU C Language Intro and Reference - info version"
DESCRIPTION = "This manual explains the C language for use with the GNU Compiler Collection (GCC) \
on the GNU/Linux system and other systems. We refer to this dialect as GNU C. \
If you already know C, you can use this as a reference manual. \
 \
This package provides the documentation in the Info format."
LICENSE = "GFDL-1.3-or-later"

PV = "20240831.93.6296201"

RPM_NAME = "c-intro-and-ref-info-20240831.93.6296201-1.7.noarch.rpm"
RPM_HASH = "3fddc2406942c529ebfb42b2efaa788cbbf013cbdecf70ffa522203df1df1e646b448b2e5d6064c2a7b380d20911731c166e0b5ada6053206de2f779a2f75450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c-intro-and-ref-info"

RDEPENDS:${PN} += ""

inherit rpm
