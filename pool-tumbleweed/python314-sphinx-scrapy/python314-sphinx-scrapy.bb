SUMMARY = "Sphinx extension for documentation in the Scrapy ecosystem"
DESCRIPTION = "Sphinx extension for documentation in the Scrapy ecosystem. \
-   Automatic configuration of intersphinx_ for Python_ and Scrapy_. \
-   Automatic configuration of Sphinx roles of the Scrapy documentation, so \
    that you can easily link to Scrapy settings, request metadata keys, signals \
    and commands:"
LICENSE = "BSD-3-Clause"

PV = "0.8.12"

RPM_NAME = "python314-sphinx-scrapy-0.8.12-1.1.noarch.rpm"
RPM_HASH = "298f87907b4b726ce42ea753e70de6ee1d80442f36c66d0664f6cf2c20bc9e58170c132d3c74cce0266d50a4404fef4ab6345e05fd70bc81998793164df81279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-scrapy \
python314-sphinx-scrapy \
python3dist-sphinx-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-Sphinx \
python314-packaging \
python314-sphinx-llms-txt \
python314-sphinx-markdown-builder \
python314-sphinx-sitemap \
python314-sphinxcontrib-copybutton"

inherit rpm
