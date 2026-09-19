SUMMARY = "Dynamic versioning based on VCS tags for uv/hatch project"
DESCRIPTION = "[poetry-dynamic-versioning](https://github.com/mtkennerly/poetry-dynamic-versioning) influenced dynamic versioning tool for [uv](https://github.com/astral-sh/uv)/[hatch](https://github.com/pypa/hatch), powered by [dunamai](https://github.com/mtkennerly/dunamai/)."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python314-uv-dynamic-versioning-0.14.1-1.1.noarch.rpm"
RPM_HASH = "e23deb0093d8bcd011c08d932d49264761778c0f313c72d91c76540562c76b9d5d88b5e934e014b7c7d47921b315dce1c634503ee3bec37e8d64e975f755d6c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uv-dynamic-versioning \
python314-uv-dynamic-versioning \
python3dist-uv-dynamic-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-dunamai \
python314-hatchling \
python314-jinja2 \
python314-tomlkit \
update-alternatives"

inherit rpm
