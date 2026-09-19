SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-unpaddedbase64-2.1.0-2.14.noarch.rpm"
RPM_HASH = "e5d89a514c1887c519d95b4d21b4f2b0e4b367b146ff3549bed12572affde0ac1931000976b4f7f45589ffaa340c7c789cdfef799752e4bd784dcdf19f8fe068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unpaddedbase64 \
python3.13dist-unpaddedbase64 \
python313-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
