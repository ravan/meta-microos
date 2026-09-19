SUMMARY = "GStreamer Thumbnailers"
DESCRIPTION = "Provides two binaries that create a thumbnails for the libgnome-desktop thumbnailer: \
 \
- gst-video-thumbnailer tries to extract the stored cover art from a video file. \
  If no cover art is found, it checks a few different frames and takes the frame \
  with the largest variance between it's the pixels. \
- gst-audio-thumbnailer tries to extract the stored cover art from an audio file."
LICENSE = "GPL-3.0"

PV = "1.1.0"

RPM_NAME = "gst-thumbnailers-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "5963ebc69ca744830f2a105e5f6c8f49f4080835c176ed3855d0c5788ced4b038a98fa0deea9b492d965a6b821c6728ab99560258780b6e6dcc9485c30ebe73b"

RPROVIDES:${PN} += "gst-thumbnailers"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
