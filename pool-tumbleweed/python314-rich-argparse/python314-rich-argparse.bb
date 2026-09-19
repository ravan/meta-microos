SUMMARY = "Rich help formatters for argparse and optparse"
DESCRIPTION = "Format argparse and optparse help using [rich](https://pypi.org/project/rich). \
 \
*rich-argparse* improves the look and readability of argparse's help while requiring minimal \
changes to the code."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-rich-argparse-1.8.0-1.3.noarch.rpm"
RPM_HASH = "edaedfbd0f7a3bdae116dd22455ebc13ffe8d9718e8b874ff6fe47310f0fc74aee2e5fefcc3c1deff5853532e975b51cd4ee30b920994d6cfab16c6dc1048686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rich-argparse \
python314-rich-argparse \
python3dist-rich-argparse"

RDEPENDS:${PN} += "python-abi \
python314-rich"

inherit rpm
