SUMMARY = "Configuration examples for jconvolver"
DESCRIPTION = "This package contains configuration examples for jconvolver, a convolution \
engine for JACK."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "jconvolver-examples-1.1.0-3.9.noarch.rpm"
RPM_HASH = "bd30b626acc66a5d53a496ca7b3332ae7d30aee9db4761bfb1f73eeba41ddc08257e7eb2185bcd31c31c4bda2a4cb113e1932dcc2454f4b48187d28fd635955c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jconvolver-examples"

RDEPENDS:${PN} += "jconvolver"

inherit rpm
