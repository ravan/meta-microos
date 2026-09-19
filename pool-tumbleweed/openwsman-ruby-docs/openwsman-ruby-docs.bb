SUMMARY = "HTML documentation for OpenWSMAN Ruby bindings"
DESCRIPTION = "This package provides HTML documentation for the OpenWSMAN Ruby \
bindings."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-ruby-docs-2.8.1-5.1.noarch.rpm"
RPM_HASH = "5abc80fc5a6c77be3cd57981e87a28f2be195dfa6e6512c2ccd717aeda436c7adffe03e13d6f7fb9bf77ebce19c36244b23025bbd2bf32fa4cd366db432c6ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-ruby-docs"

RDEPENDS:${PN} += ""

inherit rpm
