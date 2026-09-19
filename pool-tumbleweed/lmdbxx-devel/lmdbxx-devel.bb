SUMMARY = "Development files for lmdbxx"
DESCRIPTION = "Header-only Development files for lmdbxx."
LICENSE = "PDDL-1.0"

PV = "1.0.0"

RPM_NAME = "lmdbxx-devel-1.0.0-1.4.noarch.rpm"
RPM_HASH = "816babf4cd5e8ba40d6ed4fc79ef9fbd8949ee93653eb4158d9af0f570fa4a714bced03059044b24c1b44e84ecd6a2e6e72ee24ee1370253cbb8b82b446dc214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lmdbxx-devel \
lmdbxx-static"

RDEPENDS:${PN} += "lmdb-devel"

inherit rpm
