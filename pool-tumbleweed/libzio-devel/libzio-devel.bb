SUMMARY = "Libzio development files"
DESCRIPTION = "Libzio development files including zio.h, the manual page fzopen(3), \
and static library."
LICENSE = "GPL-2.0-or-later"

PV = "1.15"

RPM_NAME = "libzio-devel-1.15-1.3.aarch64.rpm"
RPM_HASH = "a1bef15f76707f6f878182f61382d5fad7adc192ae080e1bbfff3157f5f379eb7592d09a0eda5b98a2db73c9cf5f016aebdd0a043427193510dc9b29a5a3b264"

RPROVIDES:${PN} += "libzio-devel"

RDEPENDS:${PN} += "libzio1"

inherit rpm
