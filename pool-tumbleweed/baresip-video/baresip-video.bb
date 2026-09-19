SUMMARY = "Video support for the Baresip useragent"
DESCRIPTION = "A modular SIP user-agent \
with support for audio and video, and many IETF standards \
such as SIP, SDP, RTP/RTCP, STUN, TURN, and ICE. \
 \
Supports both IPv4 and IPv6, and the following features. \
 * Audio codecs: AMR, G.711, G.722, G.726, GSM, L16, MPA, OPUS. \
 * Video codecs: H.263, H.264, H.265, MPEG4, VP8, VP9. \
 * Audio drivers: Alsa, JACK, OSS, Portaudio, sndio. \
 * Video sources: FFmpeg avformat, Video4Linux2, X11 Grabber. \
 * Video output: SDL2, X11, DirectFB. \
 * NAT Traversal: STUN, TURN, ICE, NATBD, NAT-PMP, PCP. \
 * Media encryption: SRTP, DTLS-SRTP. \
 * DNS Service Discovery: Avahi. \
 * Telemetry messaging: MQTT. \
 * Control interfaces: JSON-over-TCP. \
 \
This subpackage provides the modules that are needed for video \
support."
LICENSE = "BSD-3-Clause"

PV = "4.11.0"

RPM_NAME = "baresip-video-4.11.0-1.1.aarch64.rpm"
RPM_HASH = "e992375247827d6052c6bd83587c5cdbb8ad58e62b206196105f97a5e2eab53d17cb3ae1ed06ad1b22ca750786d283641531f7c96e32631e9a8d89a97c5fe205"

RPROVIDES:${PN} += "baresip-video"

RDEPENDS:${PN} += "baresip \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libaom.so.3 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0 \
libswresample.so.6 \
libswscale.so.9 \
libvpx.so.12"

inherit rpm
