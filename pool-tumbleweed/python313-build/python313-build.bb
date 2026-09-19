SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-build-1.5.0-1.2.noarch.rpm"
RPM_HASH = "8501ddd3df1836d63dbb67c50bfdb24865ac9a09518e457d53523bc0a427f9e7a00312374e456b331252f467c89f72257a1422e8fa465e1add9e9ef75ded4f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-build \
python3.13dist-build \
python313-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-pyproject-hooks"

inherit rpm
