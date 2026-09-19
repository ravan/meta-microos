SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python313-rnc2rng-2.7.0-1.9.noarch.rpm"
RPM_HASH = "9ed8cae8ceefd373e4641e99026478dfa909055e1e6e7d3ef44fd3fe951fdb3a4f370aa054a05e5bc0b025266d08eeb2f64c23ca3d017e6b754ca8aeac31a656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnc2rng \
python3.13dist-rnc2rng \
python313-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-rply \
update-alternatives"

inherit rpm
