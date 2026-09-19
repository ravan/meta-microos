SUMMARY = "Python3 bindings for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This subpackage contains the Python3 bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "python3-louis-3.39.0-1.1.aarch64.rpm"
RPM_HASH = "fcfea5098efbe25ccd03cd014618309aeb261b4b3cbe383dff5d17e5b8aaba3b844b8a64db6f933818f22bee575ce150a0d042f460d9aa5d95458922ca01ee04"

RPROVIDES:${PN} += "python3-louis \
python3.13dist-louis \
python3dist-louis"

RDEPENDS:${PN} += "liblouis20 \
python-abi"

inherit rpm
