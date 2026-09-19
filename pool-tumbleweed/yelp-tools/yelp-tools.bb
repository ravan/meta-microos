SUMMARY = "Collection of utilities to help create documentation"
DESCRIPTION = "yelp-tools is a collection of scripts and build utilities to help create, \
manage, and publish documentation for Yelp and the web. Most of the heavy \
lifting is done by packages like yelp-xsl and itstool. This package just \
wraps things up in a developer-friendly way."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "yelp-tools-42.1-2.7.noarch.rpm"
RPM_HASH = "2961536b7cba50b0598aa4c8387f2554a081f3bdd0d78d436376e12b7dfafb87652d98faf11f05456c90b2c1e2f1602053799619f122cb1506d667aca1afc59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yelp-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
itstool \
libxml2-tools \
libxslt"

inherit rpm
