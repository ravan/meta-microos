SUMMARY = "Fish Completion for zizmor"
DESCRIPTION = "Fish command line completion support for zizmor."
LICENSE = "MIT"

PV = "1.29.0"

RPM_NAME = "zizmor-fish-completion-1.29.0-1.2.noarch.rpm"
RPM_HASH = "637399403385cb595646a1a6449f533aa6510a876c98b87d9da1f883b8b235eba837b24e2c9705075fa95fbcb201db8dfeda67ca5192dd768f20ee7043fd75c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zizmor-fish-completion"

RDEPENDS:${PN} += "fish \
zizmor"

inherit rpm
