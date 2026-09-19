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

RPM_NAME = "python314-partd-1.4.2-1.7.noarch.rpm"
RPM_HASH = "ec6caeb7d0b8b804ed049862595aead17d7b6c48ecf9911d7888e6ca457b98ae91f7a4e668ee13b0630ab5919de52b6525b07b26f58df91624cc6682931ded30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-partd \
python314-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python314-locket \
python314-toolz"

inherit rpm
