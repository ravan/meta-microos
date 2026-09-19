SUMMARY = "Typing stubs for humanfriendly"
DESCRIPTION = "Collection of library stubs for Python, with static types."
LICENSE = "Apache-2.0"

PV = "10.0.1.20241105"

RPM_NAME = "python313-types-humanfriendly-10.0.1.20241105-1.8.noarch.rpm"
RPM_HASH = "d6bee1dadc271ccabedbaffb767ca633d69ee7bbcee2f1d9d94c552668a0de333ccb4107d06802e4804a0c2287a781414e610596e7a767bcd2ff34199e35ca40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-humanfriendly \
python3.13dist-types-humanfriendly \
python313-types-humanfriendly \
python3dist-types-humanfriendly"

RDEPENDS:${PN} += ""

inherit rpm
