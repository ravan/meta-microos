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

RPM_NAME = "python314-snowballstemmer-3.1.1-1.2.noarch.rpm"
RPM_HASH = "a5c8cc51a889932115fd35dd33d20192e33e8015d1e8fd58a1b912c6c4f10f89583beac9b19624abb84b75aa6a1d3159d89b0ec4f773e9a56529c3e121220e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-snowballstemmer \
python314-snowballstemmer \
python3dist-snowballstemmer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
