SUMMARY = "Python client and CLI tool for Ironic Inspector"
DESCRIPTION = "Ironic Inspector is an auxiliary service for discovering hardware properties \
for a node managed by OpenStack Ironic. Hardware introspection or hardware \
properties discovery is a process of getting hardware parameters required for \
scheduling from a bare metal node, given its power management credentials \
(e.g. IPMI address, user name and password). \
 \
This package contains Python client and command line tool for Ironic Inspector."
LICENSE = "Apache-2.0"

PV = "5.4.0"

RPM_NAME = "python313-ironic-inspector-client-5.4.0-1.3.noarch.rpm"
RPM_HASH = "d50f611027d212904e9f167cb2a20133fe2bae74c2800cd54df9f92fb47b91d55aaf2c15626c6ce04e1f46803a6bae92d181b0a448cf198ee090d901353e7d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironic-inspector-client \
python3.13dist-python-ironic-inspector-client \
python313-ironic-inspector-client \
python3dist-python-ironic-inspector-client"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-openstackclient \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.utils \
python313-requests"

inherit rpm
