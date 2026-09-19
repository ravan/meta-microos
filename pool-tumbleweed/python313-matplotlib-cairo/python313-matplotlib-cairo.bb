SUMMARY = "Cairo backend for python313-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-cairo-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "184cd70b3034320210891b5a7821d2bb587da46494472caa4dd1ab48f418c349812921d426efa4c8f5349b075d9c05c10d0f8589b684694c0fb7c77466927065"

RPROVIDES:${PN} += "python3-matplotlib-cairo \
python313-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib"

inherit rpm
