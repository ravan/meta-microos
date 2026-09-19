SUMMARY = "Documentation for qt6-quickeffectmaker in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quickeffectmaker-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f4371e2d1ff4a9dfeab85ddeacac4ecc0a2022e1fa7e72631f87222f8bec0320fc9d51b2701b80a0364004f45344f682ac853f64c4f1072436425de1ec9e3950"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
