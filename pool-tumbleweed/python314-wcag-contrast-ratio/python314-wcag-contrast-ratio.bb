SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python314-wcag-contrast-ratio-0.9-3.5.noarch.rpm"
RPM_HASH = "d0f5aad0bbe661c532d56cb40f2be4920418576ebf54e31041a1233814b824489812ed397607953c658b2ba1f3b8aa389e91d5ecbe463265e5370257fc8863b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wcag-contrast-ratio \
python314-wcag-contrast-ratio \
python3dist-wcag-contrast-ratio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
