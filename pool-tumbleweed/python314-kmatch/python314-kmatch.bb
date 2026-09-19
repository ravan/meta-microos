SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-kmatch-0.5.0-2.12.noarch.rpm"
RPM_HASH = "1d7006f1774bd238c33a60a192af6d5a99d5d9a1a67d10146b3c30c2643ac3eb26a9ddf04f654495f6c3095382afe70bb7c1613c2b041cc3a43b90a41aa5c2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kmatch \
python314-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
