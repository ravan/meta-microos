SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python314-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "7.3"

RPM_NAME = "python314-zope.proxy-devel-7.3-1.1.aarch64.rpm"
RPM_HASH = "4df4a72af7f7779e7aef153cbd683ddd56cf91fd712fe914cb40a70a53b601a9530b42903fcca0775fdc3bf32cc43219aa19af6eec3d956e97ec504abfa7b7ca"

RPROVIDES:${PN} += "python314-zope-proxy \
python314-zope.proxy-devel"

RDEPENDS:${PN} += "python314-zope.proxy"

inherit rpm
