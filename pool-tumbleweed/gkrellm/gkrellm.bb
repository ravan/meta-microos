SUMMARY = "Manages Multiple Stacked Monitors"
DESCRIPTION = "With a single process, GKrellM manages multiple stacked monitors and \
supports applying themes to match the monitors appearance to your \
window manager, Gtk, or any other theme. \
 \
* SMP CPU, Disk, Proc, and active net interface monitors with LEDs. \
 \
* Internet monitor that displays current and charts historical port \
   hits. \
 \
* Memory and swap space usage meters and a system uptime monitor. \
 \
* File system meters show capacity and free space and can mount and \
   umount. \
 \
* A mailbox monitor that can launch a mail reader and fetch remote \
   mail. \
 \
* Clock, calendar, and hostname display. \
 \
* APM laptop battery monitor. \
 \
* CPU and motherboard temperature display if lm_sensors modules are \
   installed. \
 \
* Multiple monitors managed by a single process to reduce system \
   load. \
 \
* PPP on and off button that can execute your PPP scripts. \
 \
* Charts are autoscaling with configurable grid line resolution. \
 \
* Separate colors for 'in' and 'out' data.  The in color is used for \
   CPU user time, disk read, forks, and net receive data.  The out \
   color is used for CPU sys time, disk write, load, and net \
   transmit data. \
 \
* A different theme can be created with the GIMP."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "gkrellm-2.5.1-1.3.aarch64.rpm"
RPM_HASH = "510edd3f445d2340e852ed6ac280970d65e7db776d9fbd2481099e07fce84b1b22b3af7e770b708bd9295f5b47f12410b2d634c5bfd1bd96a5a81edc4151a61e"

RPROVIDES:${PN} += "gkrellm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsensors.so.4 \
libssl.so.3 \
libsystemd.so.0"

inherit rpm
