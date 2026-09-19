SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-tortilla-0.5.0-3.5.noarch.rpm"
RPM_HASH = "6e885a3f215b0bc01af6fd474f0f7ff7d9c2fe5c390fff3dda747a8dcaa3c68278c881abeedb7c279eebdf00410b6e86d0300e2a85b3fd1454b01505b940106e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tortilla \
python314-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python314-colorama \
python314-formats \
python314-httpretty \
python314-requests \
python314-six"

inherit rpm
