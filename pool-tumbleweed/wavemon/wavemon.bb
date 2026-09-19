SUMMARY = "An ncurses monitoring application for wireless network devices"
DESCRIPTION = "wavemon is a wireless device monitoring application that allows you to \
watch signal and noise levels, packet statistics, device configuration \
and network parameters of your wireless network hardware. It has \
currently only been tested with the Lucent Orinoco series of cards, \
although it *should* work (though with varying features) with all \
devices supported by the wireless kernel extensions by Jean Tourrilhes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.7"

RPM_NAME = "wavemon-0.9.7-1.5.aarch64.rpm"
RPM_HASH = "9103ba7549078e85dd191d30bd411bcec59e30514bf63a946812f2ede0ff834cd22c4db4dfad934ea249b23c96310b6307b83f9fa60704174f176d03a9d73433"

RPROVIDES:${PN} += "wavemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libtinfo.so.6"

inherit rpm
