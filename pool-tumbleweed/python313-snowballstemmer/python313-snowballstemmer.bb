SUMMARY = "16 stemmer algorithms"
DESCRIPTION = "This package provides 32 stemmer algorithms generated from Snowball \
algorithms. It includes following language algorithms: Arabic, \
Armenian, Basque, Catalan, Danish, Dutch, Dutch (Porter), \
English (Standard, Porter), Esperanto, Estonian, Finnish, French, \
German, Greek, Hindi, Hungarian, Indonesian, Irish, Italian, \
Lithuanian, Nepali, Norwegian, Portuguese, Romanian, Russian, \
Serbian, Spanish, Swedish, Tamil, Turkish, Yiddish."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python313-snowballstemmer-3.1.1-1.2.noarch.rpm"
RPM_HASH = "a24064eb570e57f22384694388ad17ccaf8c7e8d25decbac8759c65d8e98056c34712cd8b426a525b2aaafcfc9aca45c4ee8954ee0b240feafefb3a253e35df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snowballstemmer \
python3.13dist-snowballstemmer \
python313-snowballstemmer \
python3dist-snowballstemmer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
