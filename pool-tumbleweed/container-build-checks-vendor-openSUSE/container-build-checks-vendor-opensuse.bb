SUMMARY = "openSUSE configuration for container-build-checks"
DESCRIPTION = "openSUSE configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1779450556.9feaecd"

RPM_NAME = "container-build-checks-vendor-openSUSE-1779450556.9feaecd-1.2.noarch.rpm"
RPM_HASH = "898f58f5faf87fdeefa61a9fad00457df63925854e8abd88faa8055b677c071bfb3f8d67fa4f76057a968dcf97535711008f078e2ec3f6a95aad34c4decf3018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-vendor \
container-build-checks-vendor-openSUSE"

RDEPENDS:${PN} += "container-build-checks"

inherit rpm
