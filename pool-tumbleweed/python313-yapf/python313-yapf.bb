SUMMARY = "A formatter for Python code"
DESCRIPTION = "YAPF is based off clang-format and reformats it to the closest \
formatting that conforms to the style guide, even if the original \
code did not violate the style guide. \
 \
This is in contrast to other formatters like autopep8 and pep8ify \
which are made to only remove lint errors from code, which has some \
limitations, like, code that conforms to the PEP 8 guidelines may not \
be reformatted."
LICENSE = "Apache-2.0"

PV = "0.43.0"

RPM_NAME = "python313-yapf-0.43.0-2.5.noarch.rpm"
RPM_HASH = "aa58f92dcda1516aac0e65fc85f6908b0eda3b627ae246d32bf9e4a96bb35cc16d0423e35841bc08b977c3bbb9646451ad05cf524940a450a8ba30fd47148827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yapf \
python3.13dist-yapf \
python313-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-platformdirs"

inherit rpm
