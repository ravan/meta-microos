SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.71"

RPM_NAME = "python314-langtable-0.0.71-2.1.noarch.rpm"
RPM_HASH = "981f677c0cc3363e690c0d62fcb9dcb6636f4e5476ee9619e1a5cf59ab0b87f5a6329d03a6589fcdc26f94ba55f5ba636ab69239fcb7691c1b841be959f80f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langtable \
python314-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
