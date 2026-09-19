SUMMARY = "Dynamic versioning based on VCS tags for uv/hatch project"
DESCRIPTION = "[poetry-dynamic-versioning](https://github.com/mtkennerly/poetry-dynamic-versioning) influenced dynamic versioning tool for [uv](https://github.com/astral-sh/uv)/[hatch](https://github.com/pypa/hatch), powered by [dunamai](https://github.com/mtkennerly/dunamai/)."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python313-uv-dynamic-versioning-0.14.1-1.1.noarch.rpm"
RPM_HASH = "8ba51027e785f56054bc3b7d1c2ee9e2c934052db020bea93e00618f6fe357415786792c009a635e3bf6acc119fcdea08f3724913ea0cf6946a17cd947f5238b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uv-dynamic-versioning \
python3.13dist-uv-dynamic-versioning \
python313-uv-dynamic-versioning \
python3dist-uv-dynamic-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-dunamai \
python313-hatchling \
python313-jinja2 \
python313-tomlkit \
update-alternatives"

inherit rpm
