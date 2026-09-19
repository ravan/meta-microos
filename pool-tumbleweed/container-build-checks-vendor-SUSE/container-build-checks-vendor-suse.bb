SUMMARY = "SUSE configuration for container-build-checks"
DESCRIPTION = "SUSE configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1779450556.9feaecd"

RPM_NAME = "container-build-checks-vendor-SUSE-1779450556.9feaecd-1.2.noarch.rpm"
RPM_HASH = "fead2edadf762b5c0c577425e9d6be244979fb5e2daa188e3293ad5a01af357362300cd4b922594b122391e075b82d2ea30b0b3eac54cb48de2ea3e417b7d847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-vendor \
container-build-checks-vendor-SUSE"

RDEPENDS:${PN} += "container-build-checks"

inherit rpm
