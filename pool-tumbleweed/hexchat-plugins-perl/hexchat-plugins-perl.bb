SUMMARY = "Plugin for HexChat adds support for Perl scripts"
DESCRIPTION = "The HexChat plugin providing the Perl scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.2"

RPM_NAME = "hexchat-plugins-perl-2.16.2-4.1.aarch64.rpm"
RPM_HASH = "a41c7e72e4019c33162549a87c0243d1bc9efc88e8041502bb300cc3e88d4c1cc997301b09e8f92e50e29fb1c2f4a45438d755ee372f28df5c31700c43c4f94d"

RPROVIDES:${PN} += "hexchat-plugins-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libperl.so \
perl"

inherit rpm
