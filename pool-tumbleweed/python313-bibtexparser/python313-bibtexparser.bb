SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python313-bibtexparser-1.4.4-1.2.noarch.rpm"
RPM_HASH = "0b1dcbac61077ebfc4ecd20cec16f104c4511fef00ff42f0458f1013529d42b9031a31a10887d5401abd78b4026a5e4273ba4de17bf954ae24b7cac059dc21d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bibtexparser \
python3.13dist-bibtexparser \
python313-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python313-pyparsing"

inherit rpm
