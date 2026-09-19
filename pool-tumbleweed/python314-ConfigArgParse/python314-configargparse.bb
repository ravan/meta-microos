SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "ConfigArgParse allows options to also be set via config files and/or environment \
variables. \
 \
Applications with more than a handful of user-settable options are best configured \
through a combination of command line args, config files, hard-coded defaults, and \
in some cases, environment variables. \
 \
Python’s command line parsing modules such as argparse have very limited support \
for config files and environment variables, so this module extends argparse to \
add these features"
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "python314-ConfigArgParse-1.7.5-1.2.noarch.rpm"
RPM_HASH = "cc78853859dbf4a8bec14814b986b9e93b36ce719957ed2e26e9c26ec97f6cefe952c3904f83e9e6c4f3ff3fc70489c694a9273bbeec16138b0e0bdce491ba88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-configargparse \
python314-ConfigArgParse \
python314-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
