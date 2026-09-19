SUMMARY = "The ultimate Node.js packaging toolkit for openSUSE"
DESCRIPTION = "This package provides the ultimate Node.js packaging toolkit \
for openSUSE."
LICENSE = "MIT"

PV = "10.beta11"

RPM_NAME = "npkg-10.beta11-4.12.noarch.rpm"
RPM_HASH = "03adc930b142eac6a1e2586d1ef8229071c781795fc0c05a6e1480a4e582d4a293b2b370351e3d7a249b65201d294974792a33926b03f22055d8924ad2f36291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npkg"

RDEPENDS:${PN} += "/usr/bin/env \
nodejs-packaging \
ruby \
rubygem-json \
rubygem-nokogiri"

inherit rpm
