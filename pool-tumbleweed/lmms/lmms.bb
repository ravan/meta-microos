SUMMARY = "Linux MultiMedia Studio"
DESCRIPTION = "LMMS is a free cross-platform music studio which allows you to produce music \
with your computer. This includes the creation of melodies and beats, the \
synthesis and mixing of sounds, and arranging of samples."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0~git2024.09.21"

RPM_NAME = "lmms-1.3.0~git2024.09.21-2.9.aarch64.rpm"
RPM_HASH = "b9093abd937bc20df356a6d4f01a78932501b167e9a054eddbc9e5798c59243f9a3646d667bebd2f38f989209ad28d778fd0048444af1daf95e4b608cc19df9b"

RPROVIDES:${PN} += "libamplifier.so \
libanalyzer.so \
libaudiofileprocessor.so \
libbassbooster.so \
libbitcrush.so \
libbitinvader.so \
libcompressor.so \
libcrossovereq.so \
libdelay.so \
libdispersion.so \
libdualfilter.so \
libdynamicsprocessor.so \
libeq.so \
libflanger.so \
libfreeboy.so \
libgigplayer.so \
libgranularpitchshifter.so \
libhydrogenimport.so \
libkicker.so \
libladspabrowser.so \
libladspaeffect.so \
liblb302.so \
liblomm.so \
libmalletsstk.so \
libmidiexport.so \
libmidiimport.so \
libmonstro.so \
libmultitapecho.so \
libnes.so \
libopulenz.so \
liborganic.so \
libpatman.so \
libpeakcontrollereffect.so \
libreverbsc.so \
libsf2player.so \
libsfxr.so \
libsid.so \
libslicert.so \
libstereoenhancer.so \
libstereomatrix.so \
libtaptempo.so \
libtripleoscillator.so \
libvectorscope.so \
libvestige.so \
libvibedstrings.so \
libvstbase.so \
libvsteffect.so \
libwatsyn.so \
libwaveshaper.so \
libxpressive.so \
libzynaddsubfx.so \
lmms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libfltk.so.1.3 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libgig.so.14 \
libm.so.6 \
libmp3lame.so.0 \
libmvec.so.1 \
libogg.so.0 \
libportaudio.so.2 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libsndio.so.7 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libxcb.so.1 \
libz.so.1"

inherit rpm
