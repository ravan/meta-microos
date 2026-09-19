SUMMARY = "Fish Completion for skupper"
DESCRIPTION = "Fish command line completion support for skupper."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "skupper-fish-completion-2.2.1-1.3.noarch.rpm"
RPM_HASH = "8adeadfb2126daf13edd37afec454af0d94c1bc3e8f2de55e82bf1520d760d3888ee77a25233f3330f70c1f11b6eeba7e19427a49a65a34bda7e9a3ca9f1b53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skupper-fish-completion"

RDEPENDS:${PN} += "fish \
skupper"

inherit rpm
