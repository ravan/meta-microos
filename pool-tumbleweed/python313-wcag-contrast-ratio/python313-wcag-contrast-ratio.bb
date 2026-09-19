SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python313-wcag-contrast-ratio-0.9-3.5.noarch.rpm"
RPM_HASH = "e7333a3c937539813c948f836462bfa83981defa6ffe4f8f631c4d5baf93a2e6f320d85d0d3b9b73eb859122199b61c4927dba8bdd517b12f499e885c007cbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wcag-contrast-ratio \
python3.13dist-wcag-contrast-ratio \
python313-wcag-contrast-ratio \
python3dist-wcag-contrast-ratio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
