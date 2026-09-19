SUMMARY = "Devel files for python313-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-NetworkAuth-devel-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "42325de29a6d31c9dc80454d16b22529c0871009426bc41cb921ff52ce8d4965f9a71886698aff7569d74253874d3c91042d9108cfb148ebb8e81f79cf722f47"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth-devel \
python313-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
