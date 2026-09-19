SUMMARY = "The C Runtime Library for AVR Microcontrollers"
DESCRIPTION = "The C runtime library for the AVR family of microcontrollers for use \
with the GNU toolset (cross-avr-binutils, cross-avr-gcc, uisp, etc.)."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "avr-libc-2.2.1-2.9.noarch.rpm"
RPM_HASH = "75116d5dfe20e9837c01d2f0052d0dd9116b6d28b1574446d4323ff6ee043af83f74550587bcc7300fd245bf84d2bc937d99e8ff36bdb0d18996fb3198a3f405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avr-libc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
