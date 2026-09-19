SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python313-agate-remote-0.2.3-2.3.noarch.rpm"
RPM_HASH = "0f244ba423213b3213401c6bbb8c0199cbc90cd4bfbd299af3ff2c47e5e925c52692fbcafb6b8c306179ffa0a949995ea573d3eb5e120981335358a04757b0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-remote \
python3.13dist-agate-remote \
python313-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python313-agate \
python313-requests"

inherit rpm
