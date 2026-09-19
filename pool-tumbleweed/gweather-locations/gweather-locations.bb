SUMMARY = "GWeather Locations Database"
DESCRIPTION = "The GWeather locations database contains a list of locations used by GNOME components through the GWeather library. \
The locations are structured in an XML file, which follows a provided schema file. \
The XML source is 'compiled' into a binary format for fast parsing and access. \
Location names are translatable."
LICENSE = "GPL-2.0-or-later"

PV = "2026.2"

RPM_NAME = "gweather-locations-2026.2-1.2.aarch64.rpm"
RPM_HASH = "062ddad28e8143732cc84ee05e37a91d6d2093adb5201cddb2d8c3029ab688fc109a643bae9aa1043fa51f6fce4132cd46fcea1a24f34765f46ae2c75fd4ab1f"

RPROVIDES:${PN} += "gweather-locations \
pkgconfig-gweather-locations"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
