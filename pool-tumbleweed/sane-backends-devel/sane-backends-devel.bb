SUMMARY = "Development files for sane-backends"
DESCRIPTION = "This package contains the development files for sane-backends."
LICENSE = "GPL-2.0-or-later & SUSE-GPL-2.0+-with-sane-exception & SUSE-Public-Domain"

PV = "1.3.1"

RPM_NAME = "sane-backends-devel-1.3.1-3.11.aarch64.rpm"
RPM_HASH = "39c53b85faece5c0e8f6d98ff66d4f57b4ad1b5100bb08f8ad1d4133deb0d691c894aa9f647ba7a1bd693a592b0d38863106aca6b559421caf83189d7781abd5"

RPROVIDES:${PN} += "pkgconfig-sane-backends \
sane-backends-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libsane1"

inherit rpm
