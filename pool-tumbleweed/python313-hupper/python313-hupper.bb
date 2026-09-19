SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "python313-hupper-1.12.1-3.4.noarch.rpm"
RPM_HASH = "e2ab2f5fd2bd33fd90189279d523aca020a063fd2629374c3f92f2898c4322fd7f6ee18e88f2064127f25b77834a9b6ce44bb296155bb0e593c42eae2a48e973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hupper \
python3.13dist-hupper \
python313-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-watchdog \
update-alternatives"

inherit rpm
