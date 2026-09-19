SUMMARY = "Drop-in replacement for Click to make user-friendly and colorful CLI"
DESCRIPTION = "🌈 Drop-in replacement for Click to make user-friendly and colorful CLI"
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "python313-click-extra-9.1.0-1.1.noarch.rpm"
RPM_HASH = "7a143e583e6ced827b00cea9ddcbe3c47bc8da297532fb80d442606f108e7ee2a93e9e67f389fabbf94d1e3c922fb9684e6d45a124206a317da67693360b4c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-extra \
python3.13dist-click-extra \
python313-click-extra \
python3dist-click-extra"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-boltons \
python313-click \
python313-cloup \
python313-deepmerge \
python313-extra-platforms \
python313-tabulate \
python313-wcmatch \
python313-wcwidth"

inherit rpm
