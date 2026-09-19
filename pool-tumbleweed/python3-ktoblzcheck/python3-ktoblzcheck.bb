SUMMARY = "KtoBLZCheck python-bindings"
DESCRIPTION = "This package contains the python-bindings for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.59"

RPM_NAME = "python3-ktoblzcheck-1.59-1.5.aarch64.rpm"
RPM_HASH = "acac43a1f84cc96a089053c2c498a713101c0f1a76a0b7af24a0523b1bd9992621a4e6c3c2789e4cc35ccdc0764c2a7d326f7b6e5ad800756d00b28d240fb009"

RPROVIDES:${PN} += "python-ktoblzcheck \
python3-ktoblzcheck"

RDEPENDS:${PN} += "ktoblzcheck \
libktoblzcheck1 \
python-abi"

inherit rpm
