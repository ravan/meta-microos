SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.30.0"

RPM_NAME = "python313-xkcdpass-1.30.0-1.2.noarch.rpm"
RPM_HASH = "f18ec07a99420a601c09a41bdfc0126252cd4588b6a987d6516b3802aefb0924e3775489ce8b28259a51b436f3531b396a62cef00071513812839964bf64bdfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkcdpass \
python3.13dist-xkcdpass \
python313-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
