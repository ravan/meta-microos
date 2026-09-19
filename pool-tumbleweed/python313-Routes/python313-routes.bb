SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python313-Routes-2.5.1-5.5.noarch.rpm"
RPM_HASH = "1db33aeee59aee62a8601d397f2a4a37aee70e96c21ca3fb3968991ddff17c14b998ba0cba00f212549fae2d357588cf3e4bb6cc77914024da061cdfe4367078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Routes \
python3-routes \
python3.13dist-routes \
python313-Routes \
python313-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python313-repoze.lru"

inherit rpm
