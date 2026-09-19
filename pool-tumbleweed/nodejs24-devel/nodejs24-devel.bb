SUMMARY = "Development headers for NodeJS 24.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "24.18.1"

RPM_NAME = "nodejs24-devel-24.18.1-1.1.aarch64.rpm"
RPM_HASH = "358397b4f53c057799525f8d8aa33113780454b22c335aae9a259169dfed39d124725231359e5eb3f63682d0a46f35a365d6e8ac8cd1fce081d27bbaa2f3346d"

RPROVIDES:${PN} += "nodejs-devel \
nodejs24-devel"

RDEPENDS:${PN} += "nodejs24 \
npm24"

inherit rpm
