SUMMARY = "Documentation for iio-sensor-proxy"
DESCRIPTION = "This package contains the documentation for iio-sensor-proxy."
LICENSE = "GPL-3.0-only"

PV = "3.9"

RPM_NAME = "iio-sensor-proxy-doc-3.9-1.5.noarch.rpm"
RPM_HASH = "58b05527b30d12c22e9c9776461870eb38af12c668df5c063b5ef6617d805813bed25bf026de4f0754cb5684398f5acb473ee9eaf0f727153b6619bf19ad72d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iio-sensor-proxy-doc"

RDEPENDS:${PN} += ""

inherit rpm
