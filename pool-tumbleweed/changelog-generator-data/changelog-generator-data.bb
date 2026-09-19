SUMMARY = "Data to be consumed by containement-rpm-docker"
DESCRIPTION = "Files required to dynamically generate the new changelog file of the Docker \
image RPM."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "changelog-generator-data-1.0.0-1.19.noarch.rpm"
RPM_HASH = "251a93a48d8192472bc581aaa2611bf3de3d49bfdac8bd04c1459f94bd695e5f3000365c94995351c854fa35f690c9f755bdf5df247060b5bd9376110c5f0f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "changelog-generator-data"

RDEPENDS:${PN} += "rubygem-changelog-generator"

inherit rpm
