SUMMARY = "Disable recommends of libzypp by default"
DESCRIPTION = "This package installs a zypp.conf snippet to disable installation \
of soft dependencies (Recommends and Supplements) by default."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "zypp-no-recommends-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "dbe93dffb90852a9214f076efca05dc7e66db5bdefb80dd96f060a367f4ff2771b3f57a9c2742dec029c705d389661889a84dd91eedf48fa15b76168c9b900af"

RPROVIDES:${PN} += "zypp-no-recommends"

RDEPENDS:${PN} += "libzypp-econf"

inherit rpm
