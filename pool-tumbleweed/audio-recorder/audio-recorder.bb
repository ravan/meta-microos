SUMMARY = "An audio recorder application for the GNOME 2/3"
DESCRIPTION = "Audio-recorder allows you to record music or audio to \
a file. It can record audio from your system's soundcard, \
microphones, browsers and webcams. Put simply: if it plays out of \
your loudspeakers, you can record it. \
 \
It has an advanced timer that can: \
* Start, stop or pause recording at a given clock time. \
* Start, stop or pause after a time period. \
* Stop when the recorded file size exceeds a limit. \
* Start recording on voice or sound. \
* Stop or pause recording on 'silence'. \
 \
The recording can be automatically controlled by all MPRIS2 \
compatible players. \
 \
This program supports several audio (output) formats such as Ogg Vorbis \
audio, FLAC, Opus, MP3 and WAV."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "audio-recorder-3.3.4-3.5.aarch64.rpm"
RPM_HASH = "566fcb76ad67544759dc1850efb281f40be438f6a4bf07a2aaa6d65e5cf0f98bab4f791438a1f70bd447bbb87662123f0769b8b82be8c5d278d6047adeacf203"

RPROVIDES:${PN} += "audio-recorder"

RDEPENDS:${PN} += "/usr/bin/sh \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
