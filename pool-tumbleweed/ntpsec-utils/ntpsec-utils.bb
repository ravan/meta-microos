SUMMARY = "Utilities and commands for ntp"
DESCRIPTION = "The ntpsec utilities relying on the python module of ntp"
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "ntpsec-utils-1.2.5-1.1.noarch.rpm"
RPM_HASH = "58276ba5dca60dc23e1fd52124ecae7aad806ef2a738f407721b560625a018f35c04d71863eb7553bd6fb4dd61f118d729cd158fae8871d7c67bb2bc0d1d8b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntpsec-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ntpsec \
python3-curses \
python3-gpsd \
python3-ntp"

inherit rpm
