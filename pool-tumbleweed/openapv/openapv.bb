SUMMARY = "Open Advanced Professional Video Codec"
DESCRIPTION = "The APV codec is a professional video codec, which was developed in response to \
the need for professional level high quality video recording and post \
production. The primary purpose of the APV codec is for use in professional \
video recording and editing workflows for various types of content. \
 \
APV codec utilizes technologies known to be over 20 years to achieve a royalty \
free codec. APV builds a video codec using only conventional coding \
technologies, which consist of traditional methods published between the early \
1980s and the end of the 1990s. \
 \
The APV codec standard has the following features: \
- Perceptually lossless video quality, which is close to raw video quality \
- Low complexity and high throughput intra frame only coding without pixel domain prediction \
- Support for high bit-rate range up to a few Gbps for 2K, 4K and 8K \
  resolution content, enabled by a lightweight entropy coding scheme \
- Frame tiling for immersive content and for enabling parallel encoding and decoding \
- Support for various chroma sampling formats from 4:2:2 to 4:4:4, and bit-depths from 10 to 16 \
- Support for multiple decoding and re-encoding without severe visual quality degradation \
- Support multi-view video and auxiliary video like depth, alpha, and preview \
- Support various metadata including HDR10/10+ and user-definded format"
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "openapv-0.3.0.0-1.3.aarch64.rpm"
RPM_HASH = "c28b06229f4ff31f7c027ddf567e28fe2fe76b7c7f8e13b151d4ed1be849736087347096f62514e8696d9c2710bb253470e5e7c74d4bd972138e8094fe12f53b"

RPROVIDES:${PN} += "openapv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
