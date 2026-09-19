SUMMARY = "HFST spell checker development files"
DESCRIPTION = "Development headers and libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "hfst-ospell-devel-0.5.4-1.12.aarch64.rpm"
RPM_HASH = "2e7b690ef11b8d2bb8c668ad48eec470efb256733af080323b2a164e363ed8060916c73daa7f5924df32546bd1317c066497e077d7f8fc96c2f03d74bcf1b987"

RPROVIDES:${PN} += "hfst-ospell-devel \
pkgconfig-hfstospell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hfst-ospell"

inherit rpm
