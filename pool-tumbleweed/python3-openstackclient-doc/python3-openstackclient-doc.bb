SUMMARY = "Documentation for OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "10.3.0"

RPM_NAME = "python3-openstackclient-doc-10.3.0-1.1.noarch.rpm"
RPM_HASH = "b03516b6109e8730069e76e2c63c90d99d69d265ef4e9223931fbe56ec1ddb9a8283fbf6b16367370ca11af6cec3b3a7ba5ae5b0642d297da444d0ac79efe796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
