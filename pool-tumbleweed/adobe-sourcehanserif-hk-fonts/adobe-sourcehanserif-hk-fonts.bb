SUMMARY = "Source Han Serif variation for Traditional Chinese in Hong Kong"
DESCRIPTION = "Source Han Serif is a pan-CJK typeface. It is the serif counterpart to Source Han Sans and comes in seven weights."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "adobe-sourcehanserif-hk-fonts-2.003-1.3.noarch.rpm"
RPM_HASH = "cb201e8f187e58247938f5308f4917daaaf4f06d959424b4a14dc09d34e253159510b0492b52d466de7801b6203e9a2340a4e8e4742ec08cf7747fe46e16878e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-hk-fonts \
locale-zh-HK \
scalable-font-zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
