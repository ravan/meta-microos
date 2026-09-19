SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.13"

RPM_NAME = "python313-shortuuid-1.0.13-2.6.noarch.rpm"
RPM_HASH = "6ae3a38b175abb640cbbaa516f19d60b05eaad9c49cd9feeb5f5159b9f7148a87e65994a6d62eaf0a72ca295472fca3c3410f8c46fb397abc75919c9fa1fa632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shortuuid \
python3.13dist-shortuuid \
python313-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-base \
update-alternatives"

inherit rpm
