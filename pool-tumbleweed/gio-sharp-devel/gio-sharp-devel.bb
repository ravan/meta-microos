SUMMARY = ".NET/C# Bindings for GIO"
DESCRIPTION = "Files for developing programs that use gio-sharp"
LICENSE = "GPL-2.0 & MIT"

PV = "2.22.3"

RPM_NAME = "gio-sharp-devel-2.22.3-24.29.aarch64.rpm"
RPM_HASH = "8848ce2422100091d773dcdd699c6ab978df0cef21f9ea5c1bf0d7e471bf66338309309bc3a0c92ef5881a68e398ef13aa8d567882100febb039e31cfc189dcc"

RPROVIDES:${PN} += "gio-sharp-devel \
pkgconfig-gio-sharp-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gio-sharp \
pkgconfig-glib-sharp-2.0"

inherit rpm
