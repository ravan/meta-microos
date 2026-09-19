SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==16.0.0 is data from Unicode 16.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "16.0.0"

RPM_NAME = "python314-unicodedata2-16.0.0-2.7.aarch64.rpm"
RPM_HASH = "d7760f5301d9534be437ab46404f77e13e697776bff6116c1a815bb41610e29130bb1f8b7e34a9fc211164981f0234e91b62b068cbd58bac8eb3a8995d563c78"

RPROVIDES:${PN} += "python3.14dist-unicodedata2 \
python314-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
