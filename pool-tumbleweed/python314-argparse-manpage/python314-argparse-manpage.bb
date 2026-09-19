SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.7"

RPM_NAME = "python314-argparse-manpage-4.7-3.1.noarch.rpm"
RPM_HASH = "dfab43a7dd1d0149f0ec8fb38fd70d477612691bab2d030bb0021d08478dbc6127aa44e2330c04ddc8977240916cc3e5b41ffe531502379700772a5686bd21ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-argparse-manpage \
python314-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
