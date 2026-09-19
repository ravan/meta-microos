SUMMARY = "Verdict header files"
DESCRIPTION = "This package contains the header files and cmake config files."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "verdict-devel-1.4.4-1.5.aarch64.rpm"
RPM_HASH = "c8dafd046278bd7b79af72d303035fd028c52d9c611b99cf523c7d5b5572798d6ef09f6ba9661047f2b47f30714c7ea35485963518abc5cd6fa7a7cf7fb0481b"

RPROVIDES:${PN} += "cmake-Verdict \
verdict-devel"

RDEPENDS:${PN} += "libverdict1-4"

inherit rpm
