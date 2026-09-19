SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) \
from container images and filesystems. Exceptional for vulnerability detection \
when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "1.51.1"

RPM_NAME = "syft-1.51.1-1.1.aarch64.rpm"
RPM_HASH = "381ea5fe6c814384e52168cd85e97c37d29ee5a0b02d80c2f6ed1bb2961c4c0b2798fe98decea18d38c39f364354925ba8bb48b97797bbca22515e0c89fdad03"

RPROVIDES:${PN} += "syft"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
