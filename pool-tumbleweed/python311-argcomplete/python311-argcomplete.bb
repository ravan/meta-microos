SUMMARY = "Bash tab completion for argparse"
DESCRIPTION = "Argcomplete provides easy, extensible command line tab completion of \
arguments for your Python script. \
 \
It makes two assumptions: \
 \
* You're using bash as your shell \
* You're using argparse to manage your command line arguments/options \
 \
Argcomplete is particularly useful if your program has lots of options \
or subparsers, and if your program can dynamically suggest completions \
for your argument/option values (for example, if the user is browsing \
resources over the network)."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "python311-argcomplete-3.6.3-1.7.noarch.rpm"
RPM_HASH = "7d483996caaa5dcd052a6800905ca0a0d753394ff20aa9c429a619f0df5d8625c64fa09ffbb3ce9e9667442e139ebd3befe0aedfbb62f40e5b165b8163b53045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-argcomplete \
python311-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
