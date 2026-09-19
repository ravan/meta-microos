SUMMARY = "Documentation for OpenStack Freezer API client libary"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "6.5.0"

RPM_NAME = "python-freezerclient-doc-6.5.0-1.1.noarch.rpm"
RPM_HASH = "1caefb7f6733d1b2ccf3f2de21efff3a012835552eea74f19124943734ae455b3cd9d93e9e3c635437f070d4d73410a6f339126c96d146aad5c201ea741c464e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-freezerclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
