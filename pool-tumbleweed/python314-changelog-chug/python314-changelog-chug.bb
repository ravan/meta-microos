SUMMARY = "Parser library for project Change Log documents"
DESCRIPTION = "changelog-chug is a parser for project Change Log documents."
LICENSE = "AGPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python314-changelog-chug-0.0.3-1.8.noarch.rpm"
RPM_HASH = "c2675b061f5430140e2a27abb923616012edb9a7622efc0d91ec732926b68f32dbd0c4aa23bb24e3080faaba036f408932accf5cbbabf6c0745adad30534905e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-changelog-chug \
python314-changelog-chug \
python3dist-changelog-chug"

RDEPENDS:${PN} += "python-abi \
python314-docutils \
python314-semver"

inherit rpm
