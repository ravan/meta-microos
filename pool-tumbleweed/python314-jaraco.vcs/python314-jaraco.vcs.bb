SUMMARY = "Facilities for working with VCS repositories"
DESCRIPTION = "Facilities for working with VCS repositories"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-jaraco.vcs-2.0.0-2.5.noarch.rpm"
RPM_HASH = "bff552da1fc4161a17732c59099985eea5de508cc5514ced0e5753f055b86c3e049b261ca61ea2f38f12c08c45636043fcace60ab995050b3eb1a6ab037ae827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.vcs \
python314-jaraco.vcs \
python3dist-jaraco.vcs"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.classes \
python314-jaraco.versioning \
python314-more-itertools \
python314-packaging"

inherit rpm
