SUMMARY = "Development files to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.5.5"

RPM_NAME = "libyara-devel-4.5.5-1.4.aarch64.rpm"
RPM_HASH = "3ab4b66a6fb55707262f44814759db7ad1a87c207120730ba9ae8031b08b9b9347de6ff14f3a194d01f2b35fe4aee1b77e3e9ccca143a01d01a11809b07d223f"

RPROVIDES:${PN} += "libyara-devel \
pkgconfig-yara"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyara10 \
pkgconfig-jansson"

inherit rpm
