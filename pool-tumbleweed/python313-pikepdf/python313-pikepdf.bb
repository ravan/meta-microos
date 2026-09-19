SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "10.5.1"

RPM_NAME = "python313-pikepdf-10.5.1-2.2.aarch64.rpm"
RPM_HASH = "88a1914a49611645b6f73230edb79820354c0727130de6195e66efb18cc8d6fd253fe3440644d45833aae1aaaeb7105a43efc68aa866a0f3f2bf0e496f4eeb0b"

RPROVIDES:${PN} += "python3-pikepdf \
python3.13dist-pikepdf \
python313-pikepdf \
python3dist-pikepdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqpdf.so.30 \
libstdc++.so.6 \
python-abi \
python313-Deprecated \
python313-Pillow \
python313-lxml \
python313-packaging"

inherit rpm
