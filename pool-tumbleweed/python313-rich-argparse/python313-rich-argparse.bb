SUMMARY = "Rich help formatters for argparse and optparse"
DESCRIPTION = "Format argparse and optparse help using [rich](https://pypi.org/project/rich). \
 \
*rich-argparse* improves the look and readability of argparse's help while requiring minimal \
changes to the code."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-rich-argparse-1.8.0-1.3.noarch.rpm"
RPM_HASH = "e0506cf63b80608d9e5537275ac1ff90698f5cc6a5b71dc978177c3e9a0d941e712e08630c05bcf48204a25327fa35f9f4c34d762f653d9053fd344030610c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-argparse \
python3.13dist-rich-argparse \
python313-rich-argparse \
python3dist-rich-argparse"

RDEPENDS:${PN} += "python-abi \
python313-rich"

inherit rpm
