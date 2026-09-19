SUMMARY = "Fish Completion for velero"
DESCRIPTION = "Fish command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "velero-fish-completion-1.18.2-1.3.noarch.rpm"
RPM_HASH = "b0246904c16aa9977246032d3696f6184095930180bc6120c14ba05b06ac6abc5dd9bb97a694640319f0fffec5c3da77ff114c90a012a54e2902ecb9b31f4505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-fish-completion"

RDEPENDS:${PN} += "velero"

inherit rpm
