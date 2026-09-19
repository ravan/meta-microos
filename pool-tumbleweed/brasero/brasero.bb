SUMMARY = "CD/DVD burning application for GNOME"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write to CD/DVDs. \
 \
For data CDs/DVDs, Brasero supports multisession, Joliet extensions \
and on-the-fly image generation. The file manager can automatically \
ignore unwanted files. \
 \
For Red Book audio CDs, Brasero supports CD-TEXT, on-the-fly transcoding from \
Ogg/FLAC/etc., and intra-track silence configuration. \
 \
Brasero is capable of copying CDs/DVDs to an image file on disk and \
vice-versa. BIN/CUE is supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "brasero-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "7dc94df767208b5719f3bba60bc851e6e033ee318abb0d067c230886e81c67635ae90f9b97d331a521e8773109c2eeb3572a1d6b69d561820d4c12b81e7a1bd2"

RPROVIDES:${PN} += "brasero \
brasero-doc \
gnomebaker \
libbrasero-audio2cue.so \
libbrasero-burn-uri.so \
libbrasero-cdda2wav.so \
libbrasero-cdrdao.so \
libbrasero-cdrecord.so \
libbrasero-checksum-file.so \
libbrasero-checksum.so \
libbrasero-dvdauthor.so \
libbrasero-dvdcss.so \
libbrasero-dvdrwformat.so \
libbrasero-genisoimage.so \
libbrasero-growisofs.so \
libbrasero-libburn.so \
libbrasero-libisofs.so \
libbrasero-local-track.so \
libbrasero-mkisofs.so \
libbrasero-normalize.so \
libbrasero-readcd.so \
libbrasero-readom.so \
libbrasero-transcode.so \
libbrasero-vcdimager.so \
libbrasero-vob.so \
libbrasero-wodim.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/cdda2wav \
/usr/bin/cdrecord \
/usr/bin/mkisofs \
/usr/bin/readcd \
cdrdao \
gstreamer \
gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libbrasero-burn3.so.1 \
libbrasero-media3.so.1 \
libbrasero-utils3.so.1 \
libburn.so.4 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libisofs.so.6 \
libpango-1.0.so.0 \
libtinysparql-3.0.so.0 \
libtotem-plparser.so.18 \
libxml2.so.16"

inherit rpm
