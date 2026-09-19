SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python313-strict-rfc3339-0.7-5.5.noarch.rpm"
RPM_HASH = "6d8358d5ad26414d834de2422b7496c7d8b5f8b4ef632292f02994d059ad8af07f63c9b59db23bf4b0c88a76fa06d678ca1226eacafd019656470b0eb0983cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strict-rfc3339 \
python3.13dist-strict-rfc3339 \
python313-strict-rfc3339 \
python3dist-strict-rfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
