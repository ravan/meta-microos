SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python313-openTSNE-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "378519251f0024b4ba5d07ebc2815773fd5ce38adc43ac5b67ae8f5961381cfa9623b9ad4f344fb4b896d4a4ae22658cfb86e203f62ac94d2b105ff8db577461"

RPROVIDES:${PN} += "python3-fastTSNE \
python3-openTSNE \
python3.13dist-opentsne \
python313-fastTSNE \
python313-openTSNE \
python3dist-opentsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy \
python313-scikit-learn \
python313-scipy"

inherit rpm
