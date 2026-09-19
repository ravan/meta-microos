SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-unpaddedbase64-2.1.0-2.14.noarch.rpm"
RPM_HASH = "a73872fa4872f195a4938d779ba9c0d33b0a4a0c1404292f17e765f5264e3f85872c56cc5415e1596aa04daa91adf927a27c79e42e4d05f37909074c72ed503d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unpaddedbase64 \
python314-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
