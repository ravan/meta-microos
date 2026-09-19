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

RPM_NAME = "python312-argcomplete-3.6.3-1.7.noarch.rpm"
RPM_HASH = "c250555d0624297e0bb8b2a1052ff3ee07bc8bc9443829af1af135755e93c1f821b23f77b14f93a5379affbb2a07de3ef632f630c6db33548e688ed8642842af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-argcomplete \
python312-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
