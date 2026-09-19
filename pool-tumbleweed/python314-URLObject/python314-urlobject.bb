SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest incarnation of \
this library builds upon the ideas of its predecessor, but aims for a clearer \
API, focusing on proper method names over operator overrides. It's also being \
developed from the ground up in a test-driven manner, and has full Sphinx \
documentation."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.0.0"

RPM_NAME = "python314-URLObject-3.0.0-1.1.noarch.rpm"
RPM_HASH = "2351d2298786f9146816a7d5c3aa0eb00b04db64733e854949b13c45ef87690de354750d62ed9fd405278f273f703a61d7b29e86cddc90fa9ee0a7e4424c382d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urlobject \
python314-URLObject \
python3dist-urlobject"

RDEPENDS:${PN} += "python-abi"

inherit rpm
