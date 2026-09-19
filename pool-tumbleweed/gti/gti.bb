SUMMARY = "ASCII art punishment for misspelling git"
DESCRIPTION = "Program which will show you ASCII art car driving across the terminal when you \
misspell git command. After animation it will perform git command as well. \
Similar to sl (steam locomotive)."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "gti-1.9.1-1.9.aarch64.rpm"
RPM_HASH = "6c2943629dcaf44fb30e76b326139d6b8cbe78c99ec8a69e2769e5a1b8cf4efb0c3babf4d957a8757cb02730e586d7ab037c925b7e818744ba87b0ade70aaae7"

RPROVIDES:${PN} += "gti"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
