SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python313-cached-property-2.0.1-1.4.noarch.rpm"
RPM_HASH = "6dab205e8275745015c18c6a2439a3ff4dcb2b0a820f162aafeba8f1ca9479e86daf35ae7ce7c6b644bc2a29706e6acff1603e2ec6cbf56c8dcab7306766fe2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cached-property \
python3.13dist-cached-property \
python313-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
