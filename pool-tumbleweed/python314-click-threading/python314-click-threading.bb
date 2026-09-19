SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-click-threading-0.5.0-2.5.noarch.rpm"
RPM_HASH = "2a76100bf6d4afe8436f2be0f1f4a504c3939157b7261031bdf5b40fc2521be979157d2c8dba70f37451c5ec608c4dac82f9a7b3760517bdd53fba18389f30b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-threading \
python314-click-threading \
python3dist-click-threading"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
