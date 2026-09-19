SUMMARY = "Image datasets, models and transforms for PyTorch"
DESCRIPTION = "The torchvision package consists of popular datasets, model \
architectures, and common image transformations for computer vision \
on top of PyTorch. This build is CPU-only, matching Factory \
python-torch (CUDA disabled)."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.27.0"

RPM_NAME = "python313-torchvision-0.27.0-1.1.aarch64.rpm"
RPM_HASH = "1df9968cca9775f238b66867081c7fdfd5205b62eddc4fce1bd64d4fdda594b3718885e3712a03db3d293d1852acc06e5b30ee509dea4f57bb21e15041284763"

RPROVIDES:${PN} += "python3-torchvision \
python3.13dist-torchvision \
python313-torchvision \
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
python313-Pillow \
python313-numpy \
python313-torch"

inherit rpm
