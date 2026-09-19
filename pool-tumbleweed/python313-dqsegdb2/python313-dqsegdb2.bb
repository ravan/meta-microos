SUMMARY = "Simplified python interface to the DQSEGDB API"
DESCRIPTION = "DQSEGDB2 is a simplified Python implementation of the DQSEGDB API \
as defined in LIGO-T1300625, providing a query interface for GET \
requests to DQSEGDB."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "python313-dqsegdb2-1.2.1-2.6.noarch.rpm"
RPM_HASH = "a8e443b2bcc915b12af4e183bcaecca496f9700517aff7ec663675246935a5c94fda5b5968b5ea2a64abc5a51c45cb881d874b9382d3ec3f80cfbf62fbbdf88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dqsegdb2 \
python3.13dist-dqsegdb2 \
python313-dqsegdb2 \
python3dist-dqsegdb2"

RDEPENDS:${PN} += "python-abi \
python313-igwn-auth-utils \
python313-ligo-segments"

inherit rpm
