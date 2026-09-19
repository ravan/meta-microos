SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python313-sphinx-issues-6.0.0-1.3.noarch.rpm"
RPM_HASH = "4c79bb31f9b6d779f1c616103503f2922675e83db96468fe3c7f9cdf9d5506121aff6652507a171c08847f1e5ef95d0c5ad6a653551d7cfa25b07f6bc7d0b098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-issues \
python3.13dist-sphinx-issues \
python313-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
