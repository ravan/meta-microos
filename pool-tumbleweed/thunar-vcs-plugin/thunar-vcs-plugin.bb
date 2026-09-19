SUMMARY = "Thunar Plugin Providing VCS Integration"
DESCRIPTION = "The Thunar VCS Plugin provides integration with Subversion and GIT VCS and \
makes VCS actions available through the context menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "thunar-vcs-plugin-0.4.0-1.5.aarch64.rpm"
RPM_HASH = "7986b11f14263e3a9ad220350f8fb00f5f2f0ceb09caadcdd8a40474256416240cca737072eae23b4ec21d7756e3bc3d8fee85bcdca9e94710d9d86c2ec8b73d"

RPROVIDES:${PN} += "thunar-plugin-vcs \
thunar-vcs-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libsvn-client-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
libthunarx-3.so.0 \
libxfce4util.so.7 \
thunar"

inherit rpm
