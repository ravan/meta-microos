SUMMARY = "Small dictionary for cracklib, a password checking library"
DESCRIPTION = "CrackLib tests passwords to determine whether they match certain \
security-oriented characteristics. You can use CrackLib to stop users \
from choosing passwords that are easy to guess. \
 \
This package contains a small dictionay file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-dict-small-2.9.11-1.11.aarch64.rpm"
RPM_HASH = "e13ae98ed21e08b6335c0792f1ad865713fe322b579deeef1b5e0a1e5e827e227ad689ce93ab6e6fd14c6d4355b21857cb26a5caa7c5f9a511c85e179f193d02"

RPROVIDES:${PN} += "cracklib-dict \
cracklib-dict-small"

RDEPENDS:${PN} += ""

inherit rpm
