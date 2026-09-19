SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-docs-html-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "e36a41501de0b5a9343c051153aebe32701b062e5e15504fe483b604500c6b0b0331e9b2d2ba24a252493f7e2cc3d09bf09822eb0a3800576ea69bcc5b42fd13"

RPROVIDES:${PN} += "qt6-declarative-docs-html \
qt6-quickcontrols2-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
