SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.11.0"

RPM_NAME = "python313-pysolr-3.11.0-1.4.noarch.rpm"
RPM_HASH = "4e0909b126ae1b6321ff9cc8fc638bac6e76e577ca0aea53058fb2f6d3ab3894ba15b978346a82536686118e78b0c86d19a74a3f3ffa7e6f72a0958a10d4a9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysolr \
python3.13dist-pysolr \
python313-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
