SUMMARY = "A language for application scale JavaScript development"
DESCRIPTION = "TypeScript is a language for application-scale JavaScript. TypeScript adds \
optional types, classes, and modules to JavaScript. TypeScript supports tools \
for large-scale JavaScript applications for any browser, for any host, on any \
OS. TypeScript compiles to readable, standards-based JavaScript."
LICENSE = "Apache-2.0"

PV = "5.9.2"

RPM_NAME = "typescript-5.9.2-1.4.noarch.rpm"
RPM_HASH = "67eee21815624f6995545e4750a858bc562511f5de1c5e038eecd1fc7a1ee2d1dabe507bba154923cf30393066d664ec9318ad36a671839e27bc83edb583c399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npm-typescript \
typescript"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs-engine"

inherit rpm
