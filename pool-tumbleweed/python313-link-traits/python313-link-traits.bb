SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python313-link-traits-1.0.3-2.5.noarch.rpm"
RPM_HASH = "1a1e24411c850da501dbce483fd871ba51e40dea4dcaae8bc56d74788a2a643770e6baa5d6ee17198ecae68b61d4f19c0f76ad6aed902f7066766d71acf09ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-link-traits \
python3.13dist-link-traits \
python313-link-traits \
python3dist-link-traits"

RDEPENDS:${PN} += "python-abi \
python313-traits"

inherit rpm
