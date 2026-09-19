SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.5.4"

RPM_NAME = "python313-yara-4.5.4-2.2.aarch64.rpm"
RPM_HASH = "a43335c8d22465bb0c0550dbdafc8bf08203847dae22c52903f3f9993f2f16a5ca0a6505cef7d2f179cfffe4eda6b3ccef9129bcd21cad196c7fac60d0f79cec"

RPROVIDES:${PN} += "python3-yara \
python3.13dist-yara-python \
python313-yara \
python3dist-yara-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10 \
python-abi"

inherit rpm
