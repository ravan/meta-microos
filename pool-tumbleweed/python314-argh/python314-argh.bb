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

RPM_NAME = "python314-argh-0.31.3-1.9.noarch.rpm"
RPM_HASH = "d76f9fd11dbd97fe6f57c8a0b7d01204d17994ee9dfeaf5da49f6256a5b75346fbc58eb7847a29f9c98facfdd5cd524c9468effbed4a850ce77d210bfe17575b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-argh \
python314-argh \
python3dist-argh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
