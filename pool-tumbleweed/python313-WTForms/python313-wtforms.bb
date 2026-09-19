SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python313-WTForms-3.2.1-1.5.noarch.rpm"
RPM_HASH = "d5760d642d2a1d8382e91c8ac9c99413f821780087e0de415956e83f595d7bdbaa31c6b1ce50941f6e3998c36f6fd587edbcb406158610a31af4f769ea4e6d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WTForms \
python3.13dist-wtforms \
python313-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python313-MarkupSafe \
python313-email-validator"

inherit rpm
