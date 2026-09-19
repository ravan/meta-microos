SUMMARY = "Fish Completion for sonobuoy"
DESCRIPTION = "Fish command line completion support for sonobuoy."
LICENSE = "Apache-2.0"

PV = "0.57.5"

RPM_NAME = "sonobuoy-fish-completion-0.57.5-1.3.noarch.rpm"
RPM_HASH = "636aefe5b064eaea4262ea84c02d99def9babc445bb29f3ffabf8bdaf9a60fc8f80eb159ecd77051d4c2edda163fca008a79b7af5371f9f274241aed9d4e6fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sonobuoy-fish-completion"

RDEPENDS:${PN} += "sonobuoy"

inherit rpm
