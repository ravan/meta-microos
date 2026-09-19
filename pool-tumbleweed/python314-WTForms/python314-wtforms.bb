SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python314-WTForms-3.2.1-1.5.noarch.rpm"
RPM_HASH = "75d9b46dd66417975fba3f023ae22a816c092fb15ce22f95dbf8668b698d3cdd69f96f7f6ed7cc8882b0a9d2044cbae0852b43dfb1a6a0d6b642e40bc1fbbcdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wtforms \
python314-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python314-MarkupSafe \
python314-email-validator"

inherit rpm
