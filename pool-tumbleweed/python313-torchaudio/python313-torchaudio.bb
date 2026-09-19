SUMMARY = "Audio signal processing for PyTorch"
DESCRIPTION = "TorchAudio applies PyTorch to the audio domain: GPU-optional \
autograd-friendly transforms and a small set of C++ extensions \
(lfilter, RNNT loss, forced alignment, overdrive). This build is \
CPU-only against Factory python-torch 2.12 (CUDA disabled). Upstream \
2.11.0 is the latest release and is documented as compatible with \
later torch versions; there is no 2.12.0 torchaudio tag."
LICENSE = "BSD-2-Clause"

PV = "2.11.0"

RPM_NAME = "python313-torchaudio-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "d9a764f3791e37e85979f4904a0d51e929026696cf755e3e5cd6898966466a62a19ee3713b613d875131e5b25fb7905b558de4a1b299230e7dc8d93e34ac73d2"

RPROVIDES:${PN} += "libtorchaudio.abi3.so \
python3-torchaudio \
python3.13dist-torchaudio \
python313-torchaudio \
python3dist-torchaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorch-cpu.so \
python-abi \
python313-torch"

inherit rpm
