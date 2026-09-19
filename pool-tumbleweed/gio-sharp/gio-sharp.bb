SUMMARY = ".NET/C# Bindings for GIO"
DESCRIPTION = "C#/CLI bindings for GIO"
LICENSE = "GPL-2.0 & MIT"

PV = "2.22.3"

RPM_NAME = "gio-sharp-2.22.3-24.29.aarch64.rpm"
RPM_HASH = "187c7473063584290a3dc97822100be849ffbbf7b7c0c4000f2478be7bb29584b54ba376f7bb3e7ee28f2b552d8e4843edfb42d186f6402365ba3551bf9bb475"

RPROVIDES:${PN} += "gio-sharp \
mono-gio-sharp"

RDEPENDS:${PN} += "glib-sharp2 \
glib2 \
mono-System \
mono-core \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
