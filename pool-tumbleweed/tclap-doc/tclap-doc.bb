SUMMARY = "API Documentation for tclap-doc"
DESCRIPTION = " \
This package contains the API documentation for TCLAP, the Templatized \
C++ Command Line Parser."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "tclap-doc-1.2.5-3.10.noarch.rpm"
RPM_HASH = "a294874656b8355ef19368841987e1a858e3a6d3fd784ec8503848e956682097c7d8a92df6a7c66a4f3cf950a61900c65b732874c0db01b8ece37b2e6fad022e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tclap-doc"

RDEPENDS:${PN} += ""

inherit rpm
