SUMMARY = "Plugins For PipeWire SPA"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Unlimited input/output ports; \
 * Per port format enumeration and negotiation; \
 * Enumeration/configuration of per port parameters; \
 * Application controlled buffer allocation with option to let the plugin \
   Allocate memory; \
 * Arbitrary buffer metadata; \
 * Buffers are passed around by id which is very fast and avoids the need \
   for refcounting; \
 * Synchronous and asynchronous processing; \
 * All api is designed to work without any allocations; \
 * Arbirary input/output behaviour. \
 \
This package provides plugins for extending PipeWire SPA's functionality."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-spa-plugins-0_2-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "62f6901598f52a9a2a6c872b76c923c8ed67260b483016f6280d1e8ca959de963e02a7b060f0d0b8a424db6fa95f1564135f1fd8ec2c4f2a72b6f52386f4a0dc"

RPROVIDES:${PN} += "libspa-aec-null.so \
libspa-aec-webrtc.so \
libspa-alsa.so \
libspa-audioconvert.so \
libspa-audiomixer.so \
libspa-audiotestsrc.so \
libspa-avb.so \
libspa-bluez5.so \
libspa-codec-bluez5-aac.so \
libspa-codec-bluez5-faststream.so \
libspa-codec-bluez5-g722.so \
libspa-codec-bluez5-hfp-cvsd.so \
libspa-codec-bluez5-hfp-lc3-a127.so \
libspa-codec-bluez5-hfp-lc3-swb.so \
libspa-codec-bluez5-hfp-msbc.so \
libspa-codec-bluez5-lc3.so \
libspa-codec-bluez5-ldac.so \
libspa-codec-bluez5-opus-g.so \
libspa-codec-bluez5-opus.so \
libspa-codec-bluez5-sbc.so \
libspa-control.so \
libspa-dbus.so \
libspa-ffmpeg.so \
libspa-filter-graph-plugin-builtin.so \
libspa-filter-graph-plugin-ebur128.so \
libspa-filter-graph-plugin-ffmpeg.so \
libspa-filter-graph-plugin-ladspa.so \
libspa-filter-graph-plugin-lv2.so \
libspa-filter-graph-plugin-sofa.so \
libspa-filter-graph.so \
libspa-journal.so \
libspa-libcamera.so \
libspa-support.so \
libspa-test.so \
libspa-v4l2.so \
libspa-videoconvert.so \
libspa-videotestsrc.so \
libspa-vulkan.so \
libspa.so \
pipewire-spa-plugins-0-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavcodec.so.62 \
libavfilter.so.11 \
libavutil.so.60 \
libbluetooth.so.3 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libdbus-1.so.3 \
libdrm.so.2 \
libebur128.so.1 \
libfdk-aac.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblc3.so.1 \
libldacBT-abr.so.2 \
libldacBT-enc.so.2 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libopus.so.0 \
libsbc.so.1 \
libsndfile.so.1 \
libspandsp.so.3 \
libstdc++.so.6 \
libswscale.so.9 \
libsystemd.so.0 \
libudev.so.1 \
libusb-1.0.so.0 \
libvulkan.so.1 \
libwebrtc-audio-processing-1.so.3"

inherit rpm
