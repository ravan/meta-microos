SUMMARY = "Appendable key-value storage"
DESCRIPTION = "Key-value byte store with appendable values \
 \
Partd stores key-value pairs. \
Values are raw bytes. \
We append on old values. \
 \
Partd excels at shuffling operations."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python313-partd-1.4.2-1.7.noarch.rpm"
RPM_HASH = "ab607d5f8ac44dc86b386ccbf608ebbf12398b0b35aaf2e6d736cea8848d76833f0fa2cb1266a0fa83dc16b2f76775379022ee5a8057e5418ed9ebb742a48245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-partd \
python3.13dist-partd \
python313-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python313-locket \
python313-toolz"

inherit rpm
