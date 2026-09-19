SUMMARY = "Scripts to validate built container images"
DESCRIPTION = "This tool checks that built container images conform to the openSUSE container \
image policies (https://en.opensuse.org/Building_derived_containers)."
LICENSE = "GPL-2.0-or-later"

PV = "1779450556.9feaecd"

RPM_NAME = "container-build-checks-1779450556.9feaecd-1.2.noarch.rpm"
RPM_HASH = "980b3b0c6d6f8b479d3afcc1875ba5ae596606ab62d26c322d77a1186339303cb9b94ca9017bb7a115000bdd795424746aab1e67861eeef87cf349f5624b9033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks"

RDEPENDS:${PN} += "/usr/bin/python3 \
container-build-checks-vendor"

inherit rpm
