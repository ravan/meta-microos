SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-dependencies-jruby-20260902-1.1.noarch.rpm"
RPM_HASH = "76d948d0f9cbdce164156ed32962b6cae98ba4f954e13036404a1a848b3c4d60601e022acf66bc17dc76b830a8121332c7fd6549886b3fecdd3bdd9f81af5077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
