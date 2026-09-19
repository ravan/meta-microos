SUMMARY = "Helper to test WSGI applications - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebTest."
LICENSE = "MIT"

PV = "3.0.7"

RPM_NAME = "python-WebTest-doc-3.0.7-1.4.noarch.rpm"
RPM_HASH = "3d739baf8f95c2b6407d8233f01cf72e61ea87bed3331188733ffa777e02d1f2b963ba07c31a268c3858190dfe2ecb339ebdc5f0ef9e561e18e39ff02c6b579b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebTest-doc \
python313-WebTest-doc \
python314-WebTest-doc"

RDEPENDS:${PN} += ""

inherit rpm
