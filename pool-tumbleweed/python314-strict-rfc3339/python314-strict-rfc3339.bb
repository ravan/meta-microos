SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python314-strict-rfc3339-0.7-5.5.noarch.rpm"
RPM_HASH = "bdb4f52d1c8145e64dd74a27a408da5517cbb3404f0705cf8c6af00a53b7c2f96cf893fdc421ecbebf1f38a167786f0f7aa8fbb8e6924bc952f308c6b1eedaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-strict-rfc3339 \
python314-strict-rfc3339 \
python3dist-strict-rfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
