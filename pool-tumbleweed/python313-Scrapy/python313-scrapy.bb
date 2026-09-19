SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.17.0+git7"

RPM_NAME = "python313-Scrapy-2.17.0+git7-1.1.noarch.rpm"
RPM_HASH = "174d20f6c1fdb0feef6ce296c445d3e9a9fae6992696b33b29f7968aa970f1f408139ed07a8c7a64eecea9a4da677353c16da888ae5d43df005339ca22b0d536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Scrapy \
python3.13dist-scrapy \
python313-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Protego \
python313-PyDispatcher \
python313-Twisted \
python313-cryptography \
python313-cssselect \
python313-defusedxml \
python313-itemadapter \
python313-itemloaders \
python313-lxml \
python313-packaging \
python313-parsel \
python313-pyOpenSSL \
python313-queuelib \
python313-service-identity \
python313-tldextract \
python313-w3lib \
python313-zope.interface"

inherit rpm
