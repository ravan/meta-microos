SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.7.1"

RPM_NAME = "python314-flasgger-0.9.7.1-6.5.noarch.rpm"
RPM_HASH = "493e6427d5cd2421becc4fc961cbca563c8f894f940e7c61dab3287d8b0715e62c6f63ba6e311bc4672cb356112c5a7f7b3955141f04944ac614e3d28e18ba95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flasgger \
python314-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-PyYAML \
python314-jsonschema \
python314-mistune \
python314-packaging"

inherit rpm
