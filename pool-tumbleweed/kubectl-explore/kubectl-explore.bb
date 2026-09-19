SUMMARY = "A better kubectl explain with the fuzzy finder"
DESCRIPTION = "This plugin fuzzy-finds the field explanation from supported API resources. It \
implements different explanations for particular API version."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "kubectl-explore-0.14.1-1.7.aarch64.rpm"
RPM_HASH = "8cc5a38a83a3973a5739a62cd833cf278c0f61499e4f71c94b589e319c326aa72a716f3ce03eb49263db15f29f113caa89684415978a69ba4c4c9b05d6ce1538"

RPROVIDES:${PN} += "kubectl-explore"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
