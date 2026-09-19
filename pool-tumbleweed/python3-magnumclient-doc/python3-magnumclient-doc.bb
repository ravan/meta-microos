SUMMARY = "Documentation for OpenStack Magnum API client libary"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-magnumclient-doc-5.0.0-1.1.noarch.rpm"
RPM_HASH = "e6a03847d054e8efbaf15f9c49e4edc2b259d6aaad221cc007427b448de6a9a3e8ba85eff040033e99233a425365bb65f901a6f1513a39117291791002731f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magnumclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
