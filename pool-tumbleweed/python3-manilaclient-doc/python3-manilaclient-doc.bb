SUMMARY = "Documentation for OpenStack Share API Client"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python3-manilaclient-doc-6.3.0-1.1.noarch.rpm"
RPM_HASH = "655ae8583049af1b96b7908f74406cbc0de074e6d5399091990bc1437b19aa75d84bf5872f0abc5984a2a547b0dde782b038dd3eea9a6dba75299d93eb598614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manilaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
