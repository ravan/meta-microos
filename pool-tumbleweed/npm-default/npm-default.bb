SUMMARY = "Default version of npm"
DESCRIPTION = "Depends on the npm version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "6.1"

RPM_NAME = "npm-default-6.1-5.3.aarch64.rpm"
RPM_HASH = "b45ee8a9b380f539254577317192c0990414536077e979947894bfc3827eccac4dbf5e615aebf4d7075c32429d98a4acf8ab7d3e31a38d2d416d3b4fc7039baf"

RPROVIDES:${PN} += "npm \
npm-default"

RDEPENDS:${PN} += "nodejs-default \
npm24"

inherit rpm
