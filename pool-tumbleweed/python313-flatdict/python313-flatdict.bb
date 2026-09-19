SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python313-flatdict-4.1.0-1.4.noarch.rpm"
RPM_HASH = "2d2a655beb5899915ef7e090d36464bb49277370c7d9343d3f30181ed645984cfda0e1c528d5d0ab87f1b916d8d09676449b41c2b83de993e33b3a9c9c1f4c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatdict \
python3.13dist-flatdict \
python313-flatdict \
python3dist-flatdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
