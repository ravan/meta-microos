SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.4.7"

RPM_NAME = "python314-frozendict-2.4.7-1.4.aarch64.rpm"
RPM_HASH = "1518fedd9752d5b87744723d90aa90e002d54051385f91c9426e3d3537696931d6c9b0fb4c2690a321840148c40874388efdc5f06b318a41bfc8b152bb2d86de"

RPROVIDES:${PN} += "python3.14dist-frozendict \
python314-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
