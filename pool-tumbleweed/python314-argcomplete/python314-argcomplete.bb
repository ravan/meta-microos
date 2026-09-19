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

RPM_NAME = "python314-argcomplete-3.6.3-1.7.noarch.rpm"
RPM_HASH = "c70b1ead629d1372b3b537b5e1fe68edc5c581cc28bb62441a299968a4705c9af631bb03b05cad6acaf1ca7c5c508b6aff667a6d7617ee599ff51d48c4174625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-argcomplete \
python314-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
