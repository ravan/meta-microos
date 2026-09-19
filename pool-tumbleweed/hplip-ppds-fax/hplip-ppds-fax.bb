SUMMARY = "PPDs for HP Fax devices"
DESCRIPTION = "This package provides support for HP fax devices and multi-function devices. \
 \
This package is not necessary for operation of already configured devices."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-ppds-fax-3.26.4-2.2.noarch.rpm"
RPM_HASH = "83600ed20d40c587768a9f3626b59ef30bf1ff78367506eea0fe750bfc7c7ed74781a36ab54d6a8fae3e0f48401b450f43a390b3ef9b444f2dbbc249c9ad0a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hplip-ppds-fax \
postscriptdriver-hp;cdm-fax; \
postscriptdriver-hp;fax-2; \
postscriptdriver-hp;fax-3; \
postscriptdriver-hp;fax-4; \
postscriptdriver-hp;fax;"

RDEPENDS:${PN} += "hplip-cups"

inherit rpm
