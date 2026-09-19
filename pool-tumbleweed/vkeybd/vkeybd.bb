SUMMARY = "Virtual Keyboard Instrument"
DESCRIPTION = "Vkeybd is a virtual keyboard (as in musical instrument) for AWE32/64, \
raw MIDI, and ALSA sequencer drivers.  It is written in Tcl/Tk.  Enjoy \
playing music with your 'computer' keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.18g"

RPM_NAME = "vkeybd-0.1.18g-1.6.aarch64.rpm"
RPM_HASH = "59f37ea4958ec029641ce7c1aa395a74bb6474d27e181cb71fd11a32faf68f5e32c4b11d103cba14b1785e50722daebccacbef722ec8429609c69b1bac3f4f24"

RPROVIDES:${PN} += "vkeybd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
