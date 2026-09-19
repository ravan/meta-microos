SUMMARY = "Utilities for manipulating correlated Gaussian random variables"
DESCRIPTION = "Utilities for manipulating correlated Gaussian random variables."
LICENSE = "GPL-3.0-only"

PV = "13.1.9"

RPM_NAME = "python313-gvar-13.1.9-1.5.aarch64.rpm"
RPM_HASH = "fe427fb8ef1fcd1b95478c69eb884912d9ccecdfb4beac5aa782820d90f03169c5f879626195fef4b3941a4e93cd30312513322e9ba8b71b46e140104c53371c"

RPROVIDES:${PN} += "python3-gvar \
python3.13dist-gvar \
python313-gvar \
python3dist-gvar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy \
python313-scipy"

inherit rpm
