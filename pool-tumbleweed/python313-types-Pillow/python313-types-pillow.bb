SUMMARY = "Typing stubs for Pillow"
DESCRIPTION = "Typing stubs for Pillow"
LICENSE = "Apache-2.0"

PV = "10.2.0.20240822"

RPM_NAME = "python313-types-Pillow-10.2.0.20240822-2.5.noarch.rpm"
RPM_HASH = "2c23966ee0510a7ece4667763ae1b9a4d7ff269eaa642e61bb9eff2db836f3b19362a4e697fd7970cb2f131c9c42ea850b19640a155e48bae3bf9e11d3c62398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-Pillow \
python3.13dist-types-pillow \
python313-types-Pillow \
python3dist-types-pillow"

RDEPENDS:${PN} += ""

inherit rpm
