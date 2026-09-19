SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.4.7"

RPM_NAME = "python313-frozendict-2.4.7-1.4.aarch64.rpm"
RPM_HASH = "644eff5b58e8ba9008db61cd1f5006b938b9819dc2e5044b0ff36ecbe11765a9836b840853c86d52819f3ab887770367dddcdd1302649e3d1db2567c4b38d3ea"

RPROVIDES:${PN} += "python3-frozendict \
python3.13dist-frozendict \
python313-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
