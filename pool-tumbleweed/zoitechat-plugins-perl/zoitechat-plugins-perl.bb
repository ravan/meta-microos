SUMMARY = "Plugin for ZoiteChat adds support for Perl scripts"
DESCRIPTION = "The ZoiteChat plugin providing the Perl scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-plugins-perl-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "0752ba658c0f7fa883c3983ad6f94797ec7617bc67efaef0076e25ba7a103651f945ee13703240be5ec0e5fcfd6d714adbe7dcdc2db680866fdbe4c7d14ff187"

RPROVIDES:${PN} += "zoitechat-plugins-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libperl.so \
perl"

inherit rpm
