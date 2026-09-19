SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.29"

RPM_NAME = "python314-versioneer-toml-0.29-3.1.noarch.rpm"
RPM_HASH = "c0e0d0a4ef017a969fd55c89e954ca53c4011aee82c7ce90fa3166318dd4c31826ad183c18844e9e86dc2c4dac22b58cf0e69b4414b1d4677ca1553f7b2ad462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-versioneer-toml"

RDEPENDS:${PN} += "python314-versioneer"

inherit rpm
