SUMMARY = "Development files for the Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "libayatana-indicator3-devel-0.9.4-2.4.aarch64.rpm"
RPM_HASH = "eed8614c7065818237d1e071061651b3ffb6bcc0fa96264c57140bbb839dddcb98cb8bade37d222e61dc15805bf91be16dae7be08870348cd40bdd7de17cb308"

RPROVIDES:${PN} += "libayatana-indicator3-devel \
pkgconfig-ayatana-indicator3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-indicator3-7 \
pkgconfig-gtk+-3.0 \
pkgconfig-libayatana-ido3-0.4"

inherit rpm
