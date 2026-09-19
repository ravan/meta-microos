SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "ruby-apparmor-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "bef87f3eb0b4ccc446d99f740a8a37840d3eecd6203e663fc51db364885e65c466e742529edd86d6b10a7be0925247fdf3beeb010cff628240d745fce358380d"

RPROVIDES:${PN} += "ruby-apparmor \
ruby-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby"

inherit rpm
