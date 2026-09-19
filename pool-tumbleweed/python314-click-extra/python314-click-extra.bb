SUMMARY = "Drop-in replacement for Click to make user-friendly and colorful CLI"
DESCRIPTION = "🌈 Drop-in replacement for Click to make user-friendly and colorful CLI"
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "python314-click-extra-9.1.0-1.1.noarch.rpm"
RPM_HASH = "a5c0186d4e4f1b3984c69868c69c6608c4f87580a04d2dd93e3aad240ec919c64342e0d93b53046583a4c25fd4d3b78e93fc9806867e20bd9165591feeaf6eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-extra \
python314-click-extra \
python3dist-click-extra"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-boltons \
python314-click \
python314-cloup \
python314-deepmerge \
python314-extra-platforms \
python314-tabulate \
python314-wcmatch \
python314-wcwidth"

inherit rpm
