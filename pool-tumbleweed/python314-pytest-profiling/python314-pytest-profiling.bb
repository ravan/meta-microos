SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for pytest"
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-profiling-1.8.1-1.6.noarch.rpm"
RPM_HASH = "a740accaec01d838da3719d41561967e0be001dc072bc36ba333e6a031ebf58252c99efecb073052c5896aac5e6496e51c230448ee2a3adeba64fb05a584c903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-profiling \
python314-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python314-gprof2dot \
python314-pytest"

inherit rpm
