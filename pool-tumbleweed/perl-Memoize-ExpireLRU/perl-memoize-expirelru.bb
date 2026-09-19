SUMMARY = "Expiry plug-in for Memoize that adds LRU cache expiration"
DESCRIPTION = "For the theory of Memoization, please see the Memoize module documentation. \
This module implements an expiry policy for Memoize that follows LRU \
semantics, that is, the last n results, where n is specified as the \
argument to the 'CACHESIZE' parameter, will be cached."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.56"

RPM_NAME = "perl-Memoize-ExpireLRU-0.56-1.39.noarch.rpm"
RPM_HASH = "c5875d73cf01ff9e17b9e259f1e65bd3341088088183e083bc8a2a024116fc93a8dd706d95c40229ef6c7d45e9392d5a30b9cf432428b484421e896238b4c542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Memoize--ExpireLRU \
perl-Memoize-ExpireLRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
