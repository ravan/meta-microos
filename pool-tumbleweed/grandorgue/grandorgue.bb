SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.17.1"

RPM_NAME = "grandorgue-3.17.1-1.3.aarch64.rpm"
RPM_HASH = "d345480e1e5e24331fe02e960db79e55f38c903eeb8a19013457d76d93be88f743337dc5641b0912743d5bb5cb02dd46e46bd5519705f7fb2077a20c67ed5d70"

RPROVIDES:${PN} += "grandorgue \
libGrandOrgueCore.so.3.17.1 \
libGrandOrgueImages.so.3.17.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libmvec.so.1 \
libportaudio.so.2 \
librtaudio.so.7 \
librtmidi.so.7 \
libstdc++.so.6 \
libwavpack.so.1 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libyaml-cpp.so.0.9 \
libz.so.1 \
libzita-convolver.so.4"

inherit rpm
