SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "10.5.1"

RPM_NAME = "python314-pikepdf-10.5.1-2.2.aarch64.rpm"
RPM_HASH = "68554e5c87a3e8d31685152092bfca942d85728039f0a11dedada0c15ac69a820e885b85a70af755d235f98249e4637ab771a20a012116f91e6c6a6d5c143a81"

RPROVIDES:${PN} += "python3.14dist-pikepdf \
python314-pikepdf \
python3dist-pikepdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqpdf.so.30 \
libstdc++.so.6 \
python-abi \
python314-Deprecated \
python314-Pillow \
python314-lxml \
python314-packaging"

inherit rpm
