SUMMARY = "Source Han Sans variation for Traditional Chinese in Taiwan"
DESCRIPTION = "Source Han Sans is a pan-CJK typeface in OpenType/CFF and CID forms."
LICENSE = "OFL-1.1"

PV = "2.005"

RPM_NAME = "adobe-sourcehansans-tw-fonts-2.005-1.3.noarch.rpm"
RPM_HASH = "e2df8ab81450885c6c8d825174248ef01119dbbfacc726063ad16aad6829d8f2ff8d488d9c42a8e76cb27f9c6ffb8fe8cf28962569bbf2a48b5e88fb2673f34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-fonts \
adobe-sourcehansans-tw-fonts \
locale-zh-TW \
scalable-font-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
