SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python313-XStatic-1.0.3-2.5.noarch.rpm"
RPM_HASH = "03021d3a0ac2385d7a00235b03d868138d1a094f93fb4a4997ad6d3b2bfea06037c6d5a4b41b78288ef2e56ad5a9bd72ddce7415cf6d780f2586d399e9102f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic \
python3.13dist-xstatic \
python313-XStatic \
python3dist-xstatic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
