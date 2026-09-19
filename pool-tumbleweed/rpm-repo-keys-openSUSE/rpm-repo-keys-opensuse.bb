SUMMARY = "openSUSE repository GPG keys"
DESCRIPTION = "openSUSE GPG keys for validating packages from openSUSE repositories by \
DNF and PackageKit."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "rpm-repo-keys-openSUSE-0-13.2.noarch.rpm"
RPM_HASH = "801ea6aa7d117c856a8ac1c6e086fa6866acd334e8ce12f0f2a2c2737d7d09f894761187aa9cdaf0df6bf5e33242e84124f7b19048bababc182060e3f8d52aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-repo-keys-openSUSE"

RDEPENDS:${PN} += "openSUSE-build-key"

inherit rpm
