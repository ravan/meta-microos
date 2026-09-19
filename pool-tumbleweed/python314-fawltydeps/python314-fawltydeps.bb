SUMMARY = "Find undeclared and unused 3rd-party dependencies in your Python project"
DESCRIPTION = "Find undeclared and unused 3rd-party dependencies in your Python project."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-fawltydeps-0.20.0-2.6.noarch.rpm"
RPM_HASH = "2a8196fd600c23b2b0987344ecfe458670735b658b0b38d55fa2dbf894372bed0e77576ce60ec04982a29a824a9f2451ef22f2fc997d253e39c3e8995446a16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fawltydeps \
python314-fawltydeps \
python3dist-fawltydeps"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-importlib-metadata \
python314-isort \
python314-packaging \
python314-pip-requirements-parser \
python314-pydantic"

inherit rpm
