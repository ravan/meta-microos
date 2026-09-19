SUMMARY = "Exclude installation of docs by libzypp"
DESCRIPTION = "This package installs a zypp.conf snippet to enable excludedocs."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "zypp-excludedocs-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "581a9087154620e1812995dfdf719a2249d95959496552189026d46718c3849b95dc963a25e7803fcbb3f02fa80956ee86e32732ddb82d9eeb1380ea7e7a6d9f"

RPROVIDES:${PN} += "zypp-excludedocs"

RDEPENDS:${PN} += "libzypp-econf"

inherit rpm
