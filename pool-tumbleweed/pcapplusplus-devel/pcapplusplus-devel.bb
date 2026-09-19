SUMMARY = "C++ network sniffing and packet parsing and crafting framework"
DESCRIPTION = "PcapPlusPlus is a C++ network sniffing and packet parsing and \
manipulation framework."
LICENSE = "Unlicense"

PV = "22.11"

RPM_NAME = "pcapplusplus-devel-22.11-2.9.aarch64.rpm"
RPM_HASH = "1670fb783e86f133db7feee92712699574812381fd599278e0944bfa6d92731062690073127ff954a827b981439ffb9e64eea329a126cef4099485e435db7689"

RPROVIDES:${PN} += "pcapplusplus-devel \
pkgconfig-PcapPlusPlus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel"

inherit rpm
