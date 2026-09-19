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

RPM_NAME = "python313-argcomplete-3.6.3-1.7.noarch.rpm"
RPM_HASH = "d1df7f06ae5fb5678a0326ae8042a20a32aafe899c8f0be6865ab109ab17db74d5761b02ca1b184d2e74b65c2a3dcd57d6988acb4f4acc06e032bc266d4fd5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argcomplete \
python3.13dist-argcomplete \
python313-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
