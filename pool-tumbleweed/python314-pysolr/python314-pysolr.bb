SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.11.0"

RPM_NAME = "python314-pysolr-3.11.0-1.4.noarch.rpm"
RPM_HASH = "790880c94434c38116cebd543f7774586f73418f6f9e101b7dee9b0d9508c9ffb911b0a3b1d786ebfc97ae8da6b956f8b7376ef42721fd09542acefc34c474e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysolr \
python314-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
