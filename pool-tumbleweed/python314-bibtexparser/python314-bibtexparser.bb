SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python314-bibtexparser-1.4.4-1.2.noarch.rpm"
RPM_HASH = "a7f2598c2a385af7c89b042262655ec8481da3864df789f7c50e1014e8a04e34d1eb9c529a33d5ef26e55b9b268fe11dad220129c7501810ed3e5bed8adb3171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bibtexparser \
python314-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python314-pyparsing"

inherit rpm
