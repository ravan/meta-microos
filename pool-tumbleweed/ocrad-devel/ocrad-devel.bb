SUMMARY = "Development files for GNU ocrad"
DESCRIPTION = "Development files for GNU ocrad - useful for programs implementing OCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "ocrad-devel-0.29-1.11.aarch64.rpm"
RPM_HASH = "1bcc75318cb19457c755d68facfa6379cf6664627293ff070748f5182403e59cddb2fcf2801e5af7ab498707299fe5d49dc4bfe899e1d7f2cfc878c720c51cf6"

RPROVIDES:${PN} += "ocrad-devel"

RDEPENDS:${PN} += ""

inherit rpm
