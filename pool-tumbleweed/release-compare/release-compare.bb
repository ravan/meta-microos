SUMMARY = "Release Compare Script"
DESCRIPTION = "This package contains scripts to create changelog files relative \
to last released result. \
 \
Note: you need to use a releasetarget definition in your OBS repository \
      to get this working. And the release target needs to have published binaries."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "release-compare-0.9.2-1.6.noarch.rpm"
RPM_HASH = "6d0799dd96b3517e600b30174240188f45de9f18a8bfc29f8d000be2506944f84e5b57ad8ce641b80b061bb47bef9e2335fe24dc9fb26d80dd5f08004af5a7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-compare"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-PyYAML \
python3-setuptools"

inherit rpm
