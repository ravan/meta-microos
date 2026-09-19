SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2026.7.22"

RPM_NAME = "python313-certifi-2026.7.22-1.1.noarch.rpm"
RPM_HASH = "7ca029e42b276d4429968834d0908905549355d837d00513025fd0dd1a1b7770cc6856c4fc0e232f5e4b45d6bd1ec11680946741980f5a79b0dad6e079129f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certifi \
python3.13dist-certifi \
python313-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
openssl \
python-abi"

inherit rpm
