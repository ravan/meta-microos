SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.17.0+git7"

RPM_NAME = "python314-Scrapy-2.17.0+git7-1.1.noarch.rpm"
RPM_HASH = "353e1773b54ab7c11462b66b6b2dfec67bf27a539ccbfa76a672c04f31457ada00ab605091a94a008910bf72205810b1e5ca3726fe30fb272176df87331d593a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scrapy \
python314-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Protego \
python314-PyDispatcher \
python314-Twisted \
python314-cryptography \
python314-cssselect \
python314-defusedxml \
python314-itemadapter \
python314-itemloaders \
python314-lxml \
python314-packaging \
python314-parsel \
python314-pyOpenSSL \
python314-queuelib \
python314-service-identity \
python314-tldextract \
python314-w3lib \
python314-zope.interface"

inherit rpm
