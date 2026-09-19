SUMMARY = "Headers for default version of nodejs"
DESCRIPTION = "Depends on the most current and up-to-date version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.1"

RPM_NAME = "nodejs-devel-default-6.1-5.3.aarch64.rpm"
RPM_HASH = "f28218e970403018905ce23b66c3ba3ebefe4e16da5f59f9d92fc64fd24fb766de85ed74bc387a03a8cd22f1a3cb8651d3be1a8303e2a0831e1ce1679c339541"

RPROVIDES:${PN} += "nodejs-devel \
nodejs-devel-default"

RDEPENDS:${PN} += "nodejs24-devel \
npm-default"

inherit rpm
