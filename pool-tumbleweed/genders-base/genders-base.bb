SUMMARY = "Base configuration for gender programs and libraries"
DESCRIPTION = "Base configuration files needed by the gender and libgender packages"
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "genders-base-1.32-1.10.aarch64.rpm"
RPM_HASH = "6dff02a3957c64a85e34d28f62b7070878c366577e1859adf3d5abef72f296fd4cf5eb16e5f7c3ef2aee312f8864f0bc8373e9e3b2720843da0f11749a3d863e"

RPROVIDES:${PN} += "config-genders-base \
genders-base"

RDEPENDS:${PN} += ""

inherit rpm
