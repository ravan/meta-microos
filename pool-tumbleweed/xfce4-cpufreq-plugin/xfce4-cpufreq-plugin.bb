SUMMARY = "CPU Frequency Scaling Monitor Plugin for the Xfce Panel"
DESCRIPTION = "The CpuFreq scaling monitor plugin can be used to monitor the current CPU \
frequency and currently active governor."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "xfce4-cpufreq-plugin-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "8ca9f49eeac8fc5541157a8d45296683c55171d174b9779509f2e349ee02588a794b233c264c80ebabcb85bd91ccb84aabf0d2c1d65941fc5d7441425a94fc4c"

RPROVIDES:${PN} += "libcpufreq.so \
xfce4-cpufreq-plugin \
xfce4-panel-plugin-cpufreq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
