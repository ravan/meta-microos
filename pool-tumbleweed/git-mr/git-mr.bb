SUMMARY = "Checkout GitLab merge requests / GitHub pull requests locally"
DESCRIPTION = "Checkout GitLab merge requests / GitHub pull requests locally."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "git-mr-1.0.0-2.17.noarch.rpm"
RPM_HASH = "3d7c4f0b2db4e19fc8bc4741dab767103e235a48fd39612f4dd6a4405f399f8361a097c4d2bb598f718c66eb46f2af9641f4e0a7eb3850f4ec033d563a5d5100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-mr \
git-pr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
