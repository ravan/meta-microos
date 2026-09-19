SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-xml-3.0.5-2.2.noarch.rpm"
RPM_HASH = "b0322eeea7f3d4ca11760fec8a25ea8fe5759931cdfff445ed8b6dd0889e40ac3dbbf01be196f116b4c7ef82e3c3010c28c9656807b1ea7c0da218a7e64bfc6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-xml"

RDEPENDS:${PN} += "python314-lxml \
python314-pandas"

inherit rpm
