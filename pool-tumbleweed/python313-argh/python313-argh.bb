SUMMARY = "An argparse wrapper"
DESCRIPTION = "This Python module provides a wrapper for argparse with support for hierarchical \
commands that can be bound to modules or classes. \
 \
Features that argh adds to argparse: \
 \
* mark a function as a CLI command and specify its arguments before the parser \
  is instantiated; \
* nested commands made easy: no messing with subparsers (though they are of \
  course used under the hood); \
* infer agrument type from the default value; \
* infer command name from function name; \
* add an alias root command help for the --help argument; \
* enable passing unwrapped arguments to certain functions instead of a \
  argparse.Namespace object. \
 \
Argh is fully compatible with argparse. argh-agnostic and argh-aware code \
can be mixed. Keep in mind that argh.dispatch does some extra \
work that a custom dispatcher may not do."
LICENSE = "LGPL-3.0-or-later"

PV = "0.31.3"

RPM_NAME = "python313-argh-0.31.3-1.9.noarch.rpm"
RPM_HASH = "8e44cdd9dfab9d77101021b0c62aba1a45174ed2f15b6ddc04c66981a3f0aeb4d1ecfdcaa990d95f4b1b540d2610b43d0f4de5df27692d94522228630bc7caec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argh \
python3.13dist-argh \
python313-argh \
python3dist-argh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
