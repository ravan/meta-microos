SUMMARY = "The so-called 'Quick-to-learn' input methods for Chinese"
DESCRIPTION = "Quick-to-learn is based on the Cangjie input method, \
but only needs Cangjie's first and last word-root \
to form a character. \
 \
Includes: \
Quick3, Quick5 and Quick-Classic, \
and Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-quick-1.8.14-1.6.noarch.rpm"
RPM_HASH = "0eb0b0b88ecceb1bb06dddc022fde9802ab6f962c9dd006b2d86eddf37c3c5b41886377abed314358ae1d01ead9c41ead981562206915e1521e3fbea69d9cd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-quick \
ibus-table-quick \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
