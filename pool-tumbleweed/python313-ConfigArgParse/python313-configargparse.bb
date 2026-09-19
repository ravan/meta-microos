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

RPM_NAME = "python313-ConfigArgParse-1.7.5-1.2.noarch.rpm"
RPM_HASH = "5a91c8b7601e0c1ec95713ed26c0188c716eaf5f5184d354aa6952c9117f9864f0e2b56af8f6076625f03802598b5a2c7b52113a2572028c3a7314601421a77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigArgParse \
python3-configargparse \
python3.13dist-configargparse \
python313-ConfigArgParse \
python313-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
