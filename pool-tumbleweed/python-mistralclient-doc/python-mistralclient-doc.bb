SUMMARY = "Documentation for OpenStack Mistral API client libary"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python-mistralclient-doc-6.3.0-1.1.noarch.rpm"
RPM_HASH = "b8912c534933a820236f7cd7fccfff0c3961af18e3fa16583539e50e1b418006d8047c792bdbab9e20fc2a5a39f707ffeb38f3815eb2f55b7a73ee23f3064b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mistralclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
