SUMMARY = "X-Video Motion Compensation library"
DESCRIPTION = "X-Video Motion Compensation (XvMC), is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video-hardware. \
 \
The supported portions to be offloaded by XvMC onto the GPU are \
motion compensation (mo comp) and inverse discrete cosine transform \
(iDCT) for MPEG-2 video. XvMC also supports offloading decoding of mo \
comp, iDCT, and VLD (Variable-Length Decoding) for MPEG-2/MPEG-4-ASP."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXvMC1-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "b0e5041c1f783df7ad8009a007e5c3940dd52d7fdcdcfb128a493bb2db23940928ff0ad5ad40e214c98af48afbe130f89c8968bef3c734e3f6cc059265ddd3ef"

RPROVIDES:${PN} += "libXvMC.so.1 \
libXvMC1 \
libXvMCW.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
