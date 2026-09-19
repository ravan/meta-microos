SUMMARY = "Module bundler for JavaScript"
DESCRIPTION = "Rollup is a module bundler for JavaScript which compiles small pieces of code into \
something larger and more complex, such as a library or application. \
It uses the standardized ES module format for code, instead of previous idiosyncratic \
solutions such as CommonJS and AMD. ES modules let you freely and seamlessly combine \
the most useful individual functions from your favorite libraries. \
Rollup can optimize ES modules for faster native loading in modern browsers, \
or output a legacy module format allowing ES module workflows today."
LICENSE = "BSD-2-Clause"

PV = "3.29.5"

RPM_NAME = "rollup-3.29.5-1.4.noarch.rpm"
RPM_HASH = "f904b444b8669b070e8f801c22c624af4ce2c2475430ca2890dbdcf6dbe5724ad718705aadcc084569e83f0e52e75bbe4fd8363a91bd79f8ea9b98ad9ce11a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-rollup \
npm-rollup \
rollup"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs-engine"

inherit rpm
