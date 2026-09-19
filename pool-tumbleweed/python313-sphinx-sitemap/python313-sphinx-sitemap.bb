SUMMARY = "Sitemap generator for Sphinx"
DESCRIPTION = "Sitemap generator for Sphinx"
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python313-sphinx-sitemap-2.9.0-1.2.noarch.rpm"
RPM_HASH = "25fa91b681130f646f31b57cf935f2e768961330698ca0698993e749efabdc036ddc8427190c0fa2001b63f14c545ffd6c9d22b9d800a600fa1e1287d1c4f174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-sitemap \
python3.13dist-sphinx-sitemap \
python313-sphinx-sitemap \
python3dist-sphinx-sitemap"

RDEPENDS:${PN} += "python-abi \
python313-sphinx-last-updated-by-git"

inherit rpm
