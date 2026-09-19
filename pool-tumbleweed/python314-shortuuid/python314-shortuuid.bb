SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.13"

RPM_NAME = "python314-shortuuid-1.0.13-2.6.noarch.rpm"
RPM_HASH = "4fdaf9cd671be0aee5807c96d6ecb4d357ebe82cbfcb6e908ad562ef16be352a387c8b52470c5792d5525717287e253c26bb9ad5b0ca121019a4b6e45d8bbc5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shortuuid \
python314-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-base \
update-alternatives"

inherit rpm
