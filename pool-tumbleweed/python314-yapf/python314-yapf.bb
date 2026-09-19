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

RPM_NAME = "python314-yapf-0.43.0-2.5.noarch.rpm"
RPM_HASH = "613fdb2979dcd919885d03b242f95b46303c23c3665da82cc18521c000fcad5d3a94d519561fd7ee8c3419007fda0112cf96f9b4e9a288f04cb7eb61a595af19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yapf \
python314-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-platformdirs"

inherit rpm
