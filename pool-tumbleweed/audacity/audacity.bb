SUMMARY = "A Multi Track Digital Audio Editor"
DESCRIPTION = "Audacity is a program that manipulates digital audio wave forms. \
In addition to multitrack recording capabilities with effects, it \
imports and exports many sound file formats, including WAV, AIFF, \
AU, IRCAM, MP, and Ogg Vorbis. Wave data larger than the available \
physical memory size can be edited."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later & GPL-3.0-only"

PV = "3.7.9"

RPM_NAME = "audacity-3.7.9-1.1.aarch64.rpm"
RPM_HASH = "e7264804927dbf51ac92481bef570a6eadb6368acce5d321022c284f247087c70260d9906c3efc974b80d23af6849cca4bb54630f707ad4f3043c317586b69d5"

RPROVIDES:${PN} += "audacity \
audacity-plugins \
lib-audacity-application-logic.so \
lib-audio-devices.so \
lib-audio-graph.so \
lib-audio-io.so \
lib-basic-ui.so \
lib-builtin-effects.so \
lib-channel.so \
lib-command-parameters.so \
lib-components.so \
lib-concurrency.so \
lib-crypto.so \
lib-dynamic-range-processor.so \
lib-effects.so \
lib-exceptions.so \
lib-export-ui.so \
lib-ffmpeg-support.so \
lib-fft.so \
lib-file-formats.so \
lib-files.so \
lib-graphics.so \
lib-import-export.so \
lib-ipc.so \
lib-label-track.so \
lib-ladspa.so \
lib-lv2.so \
lib-math.so \
lib-menus.so \
lib-mixer.so \
lib-module-manager.so \
lib-music-information-retrieval.so \
lib-note-track.so \
lib-numeric-formats.so \
lib-nyquist-effects.so \
lib-playable-track.so \
lib-preference-pages.so \
lib-preferences.so \
lib-project-file-io.so \
lib-project-history.so \
lib-project-rate.so \
lib-project.so \
lib-realtime-effects.so \
lib-registries.so \
lib-sample-track.so \
lib-screen-geometry.so \
lib-shuttlegui.so \
lib-snapping.so \
lib-sqlite-helpers.so \
lib-stretching-sequence.so \
lib-string-utils.so \
lib-strings.so \
lib-tags.so \
lib-theme-resources.so \
lib-theme.so \
lib-time-and-pitch.so \
lib-time-frequency-selection.so \
lib-time-track.so \
lib-track-selection.so \
lib-track.so \
lib-transactions.so \
lib-utility.so \
lib-uuid.so \
lib-viewport.so \
lib-vst.so \
lib-wave-track-fft.so \
lib-wave-track-paint.so \
lib-wave-track-settings.so \
lib-wave-track.so \
lib-wx-init.so \
lib-wx-wrappers.so \
lib-xml.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ffmpeg \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libSoundTouch.so.1 \
libasound.so.2 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libid3tag.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmp3lame0 \
libmpg123.so.0 \
libogg.so.0 \
libopus.so.0 \
libopusfile.so.0 \
libportaudio.so.2 \
libportmidi.so.2 \
libsndfile.so.1 \
libsoxr.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsuil-0.so.0 \
libtwolame.so.0 \
libuuid.so.1 \
libvamp-hostsdk.so.3 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libwx-baseu-net-suse-nostl.so.16.0.0 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0 \
libwx-gtk3u-html-suse-nostl.so.16.0.0 \
libwx-gtk3u-qa-suse-nostl.so.16.0.0"

inherit rpm
