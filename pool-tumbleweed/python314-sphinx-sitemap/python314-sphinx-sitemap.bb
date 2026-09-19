SUMMARY = "Sitemap generator for Sphinx"
DESCRIPTION = "Sitemap generator for Sphinx"
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python314-sphinx-sitemap-2.9.0-1.2.noarch.rpm"
RPM_HASH = "72c5787e94daef31e8de9dcf49716b2f98642f46b19ee1b86b220a7df1a6cd9c863c424ca37d43ffcb04c18f4271568438cab0a291aa5c66ad4bb045d2077f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-sitemap \
python314-sphinx-sitemap \
python3dist-sphinx-sitemap"

RDEPENDS:${PN} += "python-abi \
python314-sphinx-last-updated-by-git"

inherit rpm
