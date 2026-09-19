SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.29"

RPM_NAME = "python313-versioneer-toml-0.29-3.1.noarch.rpm"
RPM_HASH = "12635258b0f3ff90185ff14fb810956058e8a4b4f55664ad9f128ee8a1e522c695eaa80e97fba09b947578565118665b35040d06c922ca011e5bb1e67747060b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer-toml \
python313-versioneer-toml"

RDEPENDS:${PN} += "python313-versioneer"

inherit rpm
