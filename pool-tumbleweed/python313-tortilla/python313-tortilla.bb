SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-tortilla-0.5.0-3.5.noarch.rpm"
RPM_HASH = "4f46ea149ba53038824cd7053655b1db899406706268829789a60da2411497bbdde27a4a3023de5f01ac98df8da0fd646b7c61d44830dcd215e3b67815e81494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tortilla \
python3.13dist-tortilla \
python313-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python313-colorama \
python313-formats \
python313-httpretty \
python313-requests \
python313-six"

inherit rpm
