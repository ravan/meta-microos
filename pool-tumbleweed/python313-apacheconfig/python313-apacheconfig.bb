SUMMARY = "Apache config file parser"
DESCRIPTION = "Apache / Config::General configuration file parser"
LICENSE = "BSD-2-Clause"

PV = "0.3.2"

RPM_NAME = "python313-apacheconfig-0.3.2-2.5.noarch.rpm"
RPM_HASH = "eb033f38c8b6c0da692b681f82b1cfd7ca98a49e8a4836a78bf769539a53a2932e3d8480031b7b86ef24b3613e4343496a8e0cf9975fff64a27d17b2d511b8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apacheconfig \
python3.13dist-apacheconfig \
python313-apacheconfig \
python3dist-apacheconfig"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-ply \
python313-six"

inherit rpm
