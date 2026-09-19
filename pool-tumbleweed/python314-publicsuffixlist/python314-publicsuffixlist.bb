SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "1.0.2.20260703"

RPM_NAME = "python314-publicsuffixlist-1.0.2.20260703-1.1.noarch.rpm"
RPM_HASH = "e0f29a17736e2d938cd7bfc3e5ff614ff02946f8de49ce9ecdb6c917da2ff950782f8755da3a817c75f68e77ff8deb3876d87bb2cd4376f57280091eee3ca409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-publicsuffixlist \
python314-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
