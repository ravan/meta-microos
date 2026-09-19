SUMMARY = "Audio signal processing for PyTorch"
DESCRIPTION = "TorchAudio applies PyTorch to the audio domain: GPU-optional \
autograd-friendly transforms and a small set of C++ extensions \
(lfilter, RNNT loss, forced alignment, overdrive). This build is \
CPU-only against Factory python-torch 2.12 (CUDA disabled). Upstream \
2.11.0 is the latest release and is documented as compatible with \
later torch versions; there is no 2.12.0 torchaudio tag."
LICENSE = "BSD-2-Clause"

PV = "2.11.0"

RPM_NAME = "python314-torchaudio-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "d02f89038422e7c668b448e2a619ec5fce2483cd57b8aa7cbed86547d18e4251fb0b305478412ff3b0507c88f7f760c775e54fb2689e6df68396bd4aabdbbdfe"

RPROVIDES:${PN} += "libtorchaudio.abi3.so \
python3.14dist-torchaudio \
python314-torchaudio \
python3dist-torchaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorch-cpu.so \
python-abi \
python314-torch"

inherit rpm
