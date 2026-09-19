SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contain various utilities related to BRLTTY."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-utils-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "83164145e6ec215834110c7f5fb9b26e269dcbd5982334a220b95b771fe700d4e34f94b329307083de78050ea451a1b110379848407e1e5767e53088bec92bc5"

RPROVIDES:${PN} += "brltty-utils"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
