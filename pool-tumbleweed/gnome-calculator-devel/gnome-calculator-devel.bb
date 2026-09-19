SUMMARY = "Development files for gnome-calculator"
DESCRIPTION = "The gnome-calculator-devel package contains libraries and header files for \
developing applications that use gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+16"

RPM_NAME = "gnome-calculator-devel-50.0+16-1.3.aarch64.rpm"
RPM_HASH = "51bedae0b7d675858a89ebd5b27319bae3e85a692b83370abad7e8858440f5c9b883f547d304e7040dfaa2ad8383746ab985de57e2a048ee7e78f267cedf7476"

RPROVIDES:${PN} += "gnome-calculator-devel \
pkgconfig-gcalc-2 \
pkgconfig-gci-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-calculator \
libgcalc-2-1-0-1 \
libgci-1-0-0-0 \
pkgconfig-gcalc-2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gtk4"

inherit rpm
