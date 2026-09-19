SUMMARY = ".NET Development"
DESCRIPTION = "Tools and libraries for .NET development using Mono."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-mono-devel_mono-20170319-1.23.aarch64.rpm"
RPM_HASH = "0aafead1e783e889f8a5158f56613f15626a2b64947e466512100677f5fb69a2dc88943c9d3541ba7282c985c964659395d433e60d2ee619db5d859a81829c5a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-mono-devel-mono"

RDEPENDS:${PN} += ""

inherit rpm
