SUMMARY = "A collection of plugins for Eye of GNOME"
DESCRIPTION = "This package contains plugins for additional features in Eye of GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugins-44.1-2.3.aarch64.rpm"
RPM_HASH = "03e4c9c44e17562f6d878d41bae7adf220cc0eb27e845ec0892b301e82bfba09f60585b265f6e4f9f507603fd902089eec93ea3cb7024f328a31abd4e8c7093d"

RPROVIDES:${PN} += "eog-plugins"

RDEPENDS:${PN} += "eog"

inherit rpm
