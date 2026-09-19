SUMMARY = "Flexible evolution of Mercurial history"
DESCRIPTION = "Flexible evolution of Mercurial history."
LICENSE = "GPL-2.0-or-later"

PV = "12.0.0"

RPM_NAME = "mercurial-extension-hg-evolve-12.0.0-1.3.noarch.rpm"
RPM_HASH = "9b2bf79af0f0a1d526a67e5ae2f6d7d61b66bd366249ac15ab852fe467e51ac1079f580c718c4ec072efb316acbdff32232c8fe1053504593a8866a87620b437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-evolve \
python3.13dist-hg-evolve \
python3dist-hg-evolve"

RDEPENDS:${PN} += "mercurial \
python-abi"

inherit rpm
