SUMMARY = "CLI tool to create, transform and attest VEX metadata"
DESCRIPTION = "vexctl is a CLI tool to create, apply, and attest VEX (Vulnerability \
Exploitability eXchange) data. Its purpose is to help with the creation and \
management of VEX documents that allow 'turning off' security scanner alerts of \
vulnerabilities known not to affect a product. \
 \
VEX can be thought of as a 'negative security advisory'. Using VEX, software \
authors can communicate to their users that an otherwise vulnerable component \
has no security implications for their product."
LICENSE = "Apache-2.0"

PV = "0.4.4+git70.36f6f3a"

RPM_NAME = "vexctl-0.4.4+git70.36f6f3a-1.1.aarch64.rpm"
RPM_HASH = "7a43c407b1bdcbdab7e5c0133bd7c4de9de23e13af0d161008800f3f1a80b31af4a4e488860595f6e178e265c2c5af50c11d26b8ec91ff2e8b14b8e02a8cbce6"

RPROVIDES:${PN} += "vexctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
