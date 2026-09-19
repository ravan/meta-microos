SUMMARY = "Pytest plugin for conditionally skipping tests"
DESCRIPTION = "It’s a collection of of useful skip markers created to simplify and reduce code \
required to skip tests in some common scenarios, for example, platform specific \
tests."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python314-pytest-skip-markers-1.5.2-1.7.noarch.rpm"
RPM_HASH = "8d8fb5575407193b262261c5cfcf8a5dd831cf358ddced9f87b17e545a53f8a0bc8133f2cb64e81fc95f0d22c02290d61d165330c544daa2bf04defc69c269fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-skip-markers \
python314-pytest-skip-markers \
python3dist-pytest-skip-markers"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-distro \
python314-pytest"

inherit rpm
