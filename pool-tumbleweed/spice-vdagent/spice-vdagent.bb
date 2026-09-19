SUMMARY = "Agent for Spice guests"
DESCRIPTION = "Spice agent for Linux guests offering the following features: \
 \
Features: \
* Client mouse mode (no need to grab mouse by client, no mouse lag) \
  this is handled by the daemon by feeding mouse events into the kernel \
  via uinput. This will only work if the active X-session is running a \
  spice-vdagent process so that its resolution can be determined. \
* Automatic adjustment of the X-session resolution to the client resolution \
* Support of copy and paste (text and images) between the active X-session \
  and the client"
LICENSE = "GPL-3.0-or-later"

PV = "0.23.0"

RPM_NAME = "spice-vdagent-0.23.0-4.2.aarch64.rpm"
RPM_HASH = "ecbb4d4981bb273b4fba01a37c7a8bef0d08fa57b302a7ceadd212a89f751b5289e2a8633bfa233367a679df73ccef85a855fb0ce27074f99c9b083a81909bd9"

RPROVIDES:${PN} += "spice-vdagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpciaccess.so.0 \
libsystemd.so.0 \
systemd"

inherit rpm
