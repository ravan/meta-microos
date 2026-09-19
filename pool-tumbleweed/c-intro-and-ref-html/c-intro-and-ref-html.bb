SUMMARY = "GNU C Language Intro and Reference - info version - HTML version"
DESCRIPTION = "This manual explains the C language for use with the GNU Compiler Collection (GCC) \
on the GNU/Linux system and other systems. We refer to this dialect as GNU C. \
If you already know C, you can use this as a reference manual. \
 \
This package provides the documentation in the HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "20240831.93.6296201"

RPM_NAME = "c-intro-and-ref-html-20240831.93.6296201-1.7.noarch.rpm"
RPM_HASH = "62fde54e6c8de8e705806a0972d8907a99d925f4ebb2dca7de205ac0727b70a932e6b5008847ee1f78d827f57782838aced900b0ca41d4de74efc7c6c009ec59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c-intro-and-ref-html"

RDEPENDS:${PN} += ""

inherit rpm
