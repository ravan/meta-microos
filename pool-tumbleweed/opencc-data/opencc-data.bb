SUMMARY = "Dictionaries for Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides dictionaries and patterns used by libraries/ \
binaries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "opencc-data-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "11a80dd134730535e33948437ac49aeb59e0422f3d9ef2ae4a38b19b4195a0bd52f66defb35d95722afe7cfe67b96700c2b68db5fc0f30bb9216eff4d67e6d09"

RPROVIDES:${PN} += "opencc-data"

RDEPENDS:${PN} += ""

inherit rpm
