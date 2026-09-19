SUMMARY = "Multichannel Digital Audio Workstation"
DESCRIPTION = "Ardour is a multichannel hard disk recorder (HDR) and digital audio \
workstation (DAW). It is capable of simultaneous recording 24 or more \
channels of 32 bit audio at 48kHz. Ardour is intended to function as a \
'professional' HDR system, replacing dedicated hardware solutions such \
as the Mackie HDR, the Tascam 2424 and more traditional tape systems \
like the Alesis ADAT series. It is also intended to provide the same \
or better functionality as software systems such as ProTools, \
Samplitude, Logic Audio, Nuendo and Cubase VST (we acknowledge these \
and all other names as trademarks of their respective owners). It \
supports MIDI Machine Control, and so can be controlled from any MMC \
controller, such as the Mackie Digital 8 Bus mixer and many other \
modern digital mixers."
LICENSE = "GPL-3.0-only"

PV = "9.8.0"

RPM_NAME = "ardour-9.8.0-1.1.aarch64.rpm"
RPM_HASH = "ff7d863281608f2dee37147dd6d21de33ea19955fb48f0763bff12b1748e218a2e8184ca69c3d567178aed90e56a3e99228d0f5a630989727d3d78e2066418a4"

RPROVIDES:${PN} += "ardour \
config-ardour \
libaaf.so.0 \
libalsa-audiobackend.so \
libardour-cc121.so \
libardour-console1.so \
libardour-contourdesign.so \
libardour-faderport.so \
libardour-faderport16.so \
libardour-faderport2.so \
libardour-faderport8.so \
libardour-generic-midi.so \
libardour-launch-control-xl.so \
libardour-launchkey-4.so \
libardour-launchpad-mini.so \
libardour-launchpad-pro.so \
libardour-launchpad-x.so \
libardour-mcp-http.so \
libardour-mcp.so \
libardour-midisurface.so \
libardour-osc.so \
libardour-push2.so \
libardour-ssl-uf8.so \
libardour-us2400.so \
libardour-websockets.so \
libardour.so.3 \
libardouralsautil.so.0 \
libardourcp.so \
libardourvampplugins.so \
libardourvamppyin.so.0 \
libaudiographer.so.0 \
libcanvas.so.0 \
libclearlooks.so \
libdummy-audiobackend.so \
libevoral.so.0 \
libgtkmm2ext.so.0 \
libjack-audiobackend.so \
libmidipp.so.4 \
libpan1in2out.so \
libpan2in2out.so \
libpanbalance.so \
libpanvbap.so \
libpbd.so.4 \
libptformat.so.0 \
libpulseaudio-backend.so \
libsuil-x11-in-gtk2.so \
libsuil.so.0 \
libtemporal.so.0 \
libwaveview.so.0 \
libwidgets.so.0 \
libydk-pixbuf.so.2 \
libydk.so.2 \
libydkmm.so.2 \
libytk.so.2 \
libytkmm.so.2 \
libztk.so.2 \
libztkmm.so.2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libarchive.so.13 \
libasound.so.2 \
libaubio.so.5 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcurl.so.4 \
libdbus-1.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjack.so.0 \
libjpeg.so.8 \
liblilv-0-0 \
liblilv-0.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
libpulse.so.0 \
libreadline.so.8 \
librubberband.so.3 \
libsamplerate.so.0 \
libserd-0.so.0 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libtag.so.2 \
libusb-1.0.so.0 \
libvamp-hostsdk.so.3 \
libvamp-sdk.so.2 \
libwebsockets.so.21 \
libxml2.so.16 \
lv2"

inherit rpm
