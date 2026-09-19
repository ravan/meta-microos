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

RPM_NAME = "python313-argparse-manpage-4.7-3.1.noarch.rpm"
RPM_HASH = "f433b4a6914b96032e5571ed42363fde4a226aac762699c398d707ebcf7b0622ec2af4becf480f2ba1721b3db083e0a245543f11b11a320ceb81dacaae1f2f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse-manpage \
python3.13dist-argparse-manpage \
python313-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
