SUMMARY = "Accuracy-focused XAudio reimplementation"
DESCRIPTION = "FAudio is an XAudio reimplementation that focuses solely on developing \
fully accurate DirectX Audio runtime libraries for the FNA project, \
including XAudio2, X3DAudio, XAPO and XACT3."
LICENSE = "Zlib"

PV = "26.08"

RPM_NAME = "libFAudio0-26.08-1.1.aarch64.rpm"
RPM_HASH = "7a091a60e416f5ac785d9830a7d6bb1504ec91ca610a121e1f259673cea79b795e61400cc91bc49d5deca570d972c984a8ee7673702957e5952f5477af6751c1"

RPROVIDES:${PN} += "libFAudio.so.0 \
libFAudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6"

inherit rpm
