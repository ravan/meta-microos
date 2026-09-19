SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-gtk-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "0a0cf6e934a9bc1717a0a76359f4379006a6556a14d752ebbdd8d4afd4aacefe6023e68378bf0fd4fe31d3756c695fada08473f99f5abf28ebdbd0a7b651c57f"

RPROVIDES:${PN} += "libperf-gtk.so \
perf-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
perf"

inherit rpm
