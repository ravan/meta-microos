SUMMARY = "Format agnostic SBOM tooling"
DESCRIPTION = "bomctl is format-agnostic Software Bill of Materials (SBOM) tooling, which is \
intended to bridge the gap between SBOM generation and SBOM analysis tools. It \
focuses on supporting more complex SBOM operations on multiple SBOM files that \
represent systems by being opinionated on only supporting the NTIA minimum \
fields or other fields supported by protobom."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "bomctl-0.4.3-1.8.aarch64.rpm"
RPM_HASH = "901d31eb263cea1e8c854617b7800713bd370dd8c75b341ccd19f6d481c5dd15b226588ad88274566d1b1e1a89976c1f8649d7f02ff68105ed29bc93b82ff6f1"

RPROVIDES:${PN} += "bomctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
