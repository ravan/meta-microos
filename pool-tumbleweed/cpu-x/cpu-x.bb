SUMMARY = "Hardware overview utility"
DESCRIPTION = "CPU-X is a software that gathers information about CPU, motherboard \
and peripherals. It is similar to CPU-Z (Windows) and can be used in \
graphical mode by using GTK or in text-based mode by using NCurses. A \
dump mode is present from command line."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "cpu-x-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "1c0afabff635620b2b87c34ddf2fdac157129d764aae5e24c48531873e3d9cdd627072ab79b0721b383209d1a265b2df0452f3f27451f3c5f3cab19ee40a9d42"

RPROVIDES:${PN} += "bundled-bandwidth \
bundled-dmidecode \
cpu-x \
cpu-x-bash-completion \
cpu-x-fish-completion \
cpu-x-zsh-completion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOpenCL.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcpuid.so.18 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpangomm-1.4.so.1 \
libpci.so.3 \
libproc2.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libvulkan.so.1"

inherit rpm
