SUMMARY = "Image datasets, models and transforms for PyTorch"
DESCRIPTION = "The torchvision package consists of popular datasets, model \
architectures, and common image transformations for computer vision \
on top of PyTorch. This build is CPU-only, matching Factory \
python-torch (CUDA disabled)."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.27.0"

RPM_NAME = "python314-torchvision-0.27.0-1.1.aarch64.rpm"
RPM_HASH = "1e4967eaadef4028b08890f80d6aba4172478e76e7148afd79c1cc6f932d7778f36aed579bf460dc3eae01dc053f44fa4af50f6c58f7ab0641475adedb7a5b3c"

RPROVIDES:${PN} += "python3.14dist-torchvision \
python314-torchvision \
python3dist-torchvision"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libc10.so \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtorch-cpu.so \
libwebp.so.7 \
python-abi \
python314-Pillow \
python314-numpy \
python314-torch"

inherit rpm
