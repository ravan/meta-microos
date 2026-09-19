SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-dependencies-picoruby-20260902-1.1.noarch.rpm"
RPM_HASH = "c6eb2927a57afaf1d2e7a88541a973a1e4928b516914dd332322403659cd3744cb01bba617c7ef69e542989c3be8425a3a5924416bc6d4889d181cb2c5424fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
