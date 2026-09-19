SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python313-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "7.3"

RPM_NAME = "python313-zope.proxy-devel-7.3-1.1.aarch64.rpm"
RPM_HASH = "33f114d6a637c46bd4572afbd916916a933503846a3d4ee56e4bc586ce393d72a0a02f94cef4b7df7debde8de0601fae551f49de60e60db17c6dd6eb805d3d38"

RPROVIDES:${PN} += "python3-zope-proxy \
python3-zope.proxy-devel \
python313-zope-proxy \
python313-zope.proxy-devel"

RDEPENDS:${PN} += "python313-zope.proxy"

inherit rpm
