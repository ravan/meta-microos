SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.14"

RPM_NAME = "python314-isbnlib-3.10.14-3.1.noarch.rpm"
RPM_HASH = "1a8eab7c4e43a1db8e28d68c2ef28a7af363179374316b9140dbee4153c181ba7e078613226b7c981f96ab7bf49d1e17b6b9a62e5afe7f34a30f61727ed0a7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-isbnlib \
python314-isbnlib \
python3dist-isbnlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
