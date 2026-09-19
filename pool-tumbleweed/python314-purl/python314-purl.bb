SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python314-purl-1.6-3.5.noarch.rpm"
RPM_HASH = "40203ebf0c9f9087748bde8c5a0e72678a3c0ea53b603ece874683da04cd49776c3ed19be42b706ebfb198eeabc223b12252eb0cf96a5706b7faacb47afd7eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-purl \
python314-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
