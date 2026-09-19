SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python314-XStatic-1.0.3-2.5.noarch.rpm"
RPM_HASH = "9759d8d4cc26c31eb3e9969e978148d31bfa01e73c2a4af777537b7af282d2ff8678ee1c63345326936e4f07e8e7466fe96f025c6243a750ec6fd98a766cc270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xstatic \
python314-XStatic \
python3dist-xstatic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
