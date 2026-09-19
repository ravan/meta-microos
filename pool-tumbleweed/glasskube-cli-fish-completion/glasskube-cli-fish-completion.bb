SUMMARY = "Fish Completion for glasskube-cli"
DESCRIPTION = "Fish command line completion support for glasskube-cli."
LICENSE = "Apache-2.0"

PV = "0.26.1"

RPM_NAME = "glasskube-cli-fish-completion-0.26.1-1.10.noarch.rpm"
RPM_HASH = "c32e37dab2489c9db91927d607272bd6a3f2f00ed5ca731a3eb009bdc3b800676d3f5b23446aa399f2cd42802c50d496d35ab4dafbd97537fa15bba151211ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glasskube-cli-fish-completion"

RDEPENDS:${PN} += "glasskube-cli"

inherit rpm
