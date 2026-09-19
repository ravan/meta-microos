SUMMARY = "Tool for audio spectrum analysis and visualization"
DESCRIPTION = "Spek helps to analyse your audio files by showing their spectrogram. \
It supports all popular lossy and lossless audio file formats. \
 \
Features: \
  * Ultra-fast signal processing, uses multiple threads to further \
    speed up the analysis \
  * Shows the codec name and the audio signal parameters \
  * Can save the spectrogram as an image file \
  * Drag-and-drop support; associates with common audio file formats \
  * Auto-fitting time, frequency and spectral density rulers \
  * Adjustable spectral density range"
LICENSE = "GPL-3.0-only"

PV = "0.8.5"

RPM_NAME = "spek-0.8.5-4.7.aarch64.rpm"
RPM_HASH = "09e4a15724c120b8ed4bf911e67b80450798b462431ba1f2843b91307bc6f010cdec7d73383d5e1c2a40035377a404f6e6f50c322646a40a746bb1472c2471e7"

RPROVIDES:${PN} += "spek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
