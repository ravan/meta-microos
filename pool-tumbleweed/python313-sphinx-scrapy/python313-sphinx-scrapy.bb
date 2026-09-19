SUMMARY = "Sphinx extension for documentation in the Scrapy ecosystem"
DESCRIPTION = "Sphinx extension for documentation in the Scrapy ecosystem. \
-   Automatic configuration of intersphinx_ for Python_ and Scrapy_. \
-   Automatic configuration of Sphinx roles of the Scrapy documentation, so \
    that you can easily link to Scrapy settings, request metadata keys, signals \
    and commands:"
LICENSE = "BSD-3-Clause"

PV = "0.8.12"

RPM_NAME = "python313-sphinx-scrapy-0.8.12-1.1.noarch.rpm"
RPM_HASH = "dbe219a4a8ccc24c95cb739e30eb361e74af90850d609a0c96a665b6556f6db8a0a6f470555da54e61b6cd93cf07dfe4e05da935f426f573474a92b9b0aa4989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-scrapy \
python3.13dist-sphinx-scrapy \
python313-sphinx-scrapy \
python3dist-sphinx-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-Sphinx \
python313-packaging \
python313-sphinx-llms-txt \
python313-sphinx-markdown-builder \
python313-sphinx-sitemap \
python313-sphinxcontrib-copybutton"

inherit rpm
