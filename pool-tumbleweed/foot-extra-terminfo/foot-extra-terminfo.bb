SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "foot-extra-terminfo-1.28.0-1.1.noarch.rpm"
RPM_HASH = "a3f2f9eda0f12f6f3c22b7dfee1e1acdb5781310c0c4ac8c6cd28ebd2bbfc526fc43cb90ce3412f4412fe23bca7714f3f8d972855c9e9c28efb62259d091a798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
