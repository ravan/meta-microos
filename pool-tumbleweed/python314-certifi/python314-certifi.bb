SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2026.7.22"

RPM_NAME = "python314-certifi-2026.7.22-1.1.noarch.rpm"
RPM_HASH = "e062c69ded5bf314dc1105c6f653909e81d7dbee51e8e4a954ec6a2ddf0881c71e573db666f98d3871af34ff2a72202d3443cd5dba80c4562b2d1c66452aa467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certifi \
python314-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
openssl \
python-abi"

inherit rpm
